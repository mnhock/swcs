package swcs.gof.behavioral.visitor.fridge;

import java.time.LocalDate;
import java.time.ZoneId;

public class BestBeforeDateVisitor implements Visitor {

    private final LocalDate compareDate;

    public BestBeforeDateVisitor(LocalDate compareDate) {
        this.compareDate = compareDate;
    }

    @Override
    public void visit(Beer beer) {
        checkBestBeforeDate(beer, beer.bestBeforeDate()); // method differ
    }

    @Override
    public void visit(Milk milk) {
        checkBestBeforeDate(milk, milk.bestBeforeDate() // method differ
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate());
    }

    @Override
    public void visit(Butter butter) {
        checkBestBeforeDate(butter, butter.expiryDate()); // method differ
    }

    private void checkBestBeforeDate(FridgeElement element, LocalDate bestBeforeDate) {
        if (bestBeforeDate.isAfter(this.compareDate)) {
            System.out.println(element.getClass().getSimpleName());
        }
    }
}
