package swcs.junit.fridge;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FridgeTest {

    private static final String BEER = "BEER";
    private static final String RED_BULL = "RED_BULL";

    private final Fridge fridge = new Fridge();

    @Test
    void shouldContainAddedProduct() {
        this.fridge.put(BEER);

        assertTrue(this.fridge.contains(BEER));
    }

    @Test
    void shouldNotAllowToStoreMoreThanOneIdenticalProductAtTheSameTime() {
        this.fridge.put(BEER);

        assertFalse(this.fridge.put(BEER));
    }

    @Test
    void shouldStoreProductAfterTryingToAddTheSameOne() {
        this.fridge.put(BEER);
        this.fridge.put(BEER);

        assertTrue(this.fridge.contains(BEER));
    }

    @Test
    void shouldAllowToStoreMultipleProductsAtTheSameTime() {
        this.fridge.put(BEER);
        this.fridge.put(RED_BULL);

        assertTrue(this.fridge.contains(BEER));
        assertTrue(this.fridge.contains(RED_BULL));
    }

    @Test
    void shouldAllowToPutTheSameProductMultipleTimesWhenItsNotThere() throws NoSuchItemException {
        this.fridge.put(BEER);
        this.fridge.take(BEER);
        this.fridge.put(BEER);

        assertTrue(this.fridge.contains(BEER));
    }

    @Test
    void shouldNotContainNotAddedProduct() {
        this.fridge.put(BEER);

        assertFalse(this.fridge.contains(RED_BULL));
    }

    @Test
    void shouldThrowNSIEWhenTakingProductWhichWasNeverAdded() throws NoSuchItemException {
        assertThrows(NoSuchItemException.class, () -> this.fridge.take(BEER));
    }

    @Test
    void shouldThrowNSIEWhenTakingProductWhichWasAlreadyTaken() throws NoSuchItemException {
        this.fridge.put(BEER);
        this.fridge.take(BEER);

        assertThrows(NoSuchItemException.class, () -> this.fridge.take(BEER));
    }

    @Test
    void shouldContainNoProductsWhenAllProductsWereTaken() throws NoSuchItemException {
        this.fridge.put(BEER);
        this.fridge.put(RED_BULL);
        this.fridge.take(BEER);
        this.fridge.take(RED_BULL);

        assertFalse(this.fridge.contains(BEER));
        assertFalse(this.fridge.contains(RED_BULL));
    }

}
