package swcs.junit.fridge;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FridgeTest {

    private static final String BEER = "BEER";
    private static final String RED_BULL = "RED_BULL";

    private Fridge fridge = new Fridge();

    @Test
    void shouldContainAddedProduct() {
        fridge.put(BEER);

        assertTrue(fridge.contains(BEER));
    }

    @Test
    void shouldNotAllowToStoreMoreThanOneIdenticalProductAtTheSameTime() {
        fridge.put(BEER);

        assertFalse(fridge.put(BEER));
    }

    @Test
    void shouldStoreProductAfterTryingToAddTheSameOne() {
        fridge.put(BEER);
        fridge.put(BEER);

        assertTrue(fridge.contains(BEER));
    }

    @Test
    void shouldAllowToStoreMultipleProductsAtTheSameTime() {
        fridge.put(BEER);
        fridge.put(RED_BULL);

        assertTrue(fridge.contains(BEER));
        assertTrue(fridge.contains(RED_BULL));
    }

    @Test
    void shouldAllowToPutTheSameProductMultipleTimesWhenItsNotThere() throws NoSuchItemException {
        fridge.put(BEER);
        fridge.take(BEER);
        fridge.put(BEER);

        assertTrue(fridge.contains(BEER));
    }

    @Test
    void shouldNotContainNotAddedProduct() {
        fridge.put(BEER);

        assertFalse(fridge.contains(RED_BULL));
    }

    @Test
    void shouldThrowNSIEWhenTakingProductWhichWasNeverAdded() throws NoSuchItemException {
        assertThrows(NoSuchItemException.class, () -> fridge.take(BEER));
    }

    @Test
    void shouldThrowNSIEWhenTakingProductWhichWasAlreadyTaken() throws NoSuchItemException {
        fridge.put(BEER);
        fridge.take(BEER);

        assertThrows(NoSuchItemException.class, () -> fridge.take(BEER));
    }

    @Test
    void shouldContainNoProductsWhenAllProductsWereTaken() throws NoSuchItemException {
        fridge.put(BEER);
        fridge.put(RED_BULL);
        fridge.take(BEER);
        fridge.take(RED_BULL);

        assertFalse(fridge.contains(BEER));
        assertFalse(fridge.contains(RED_BULL));
    }

}
