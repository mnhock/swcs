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
        checkBestBeforDate(beer, beer.bestBeforeDate()); // method differ
    }

    @Override
    public void visit(Milk milk) {
        checkBestBeforDate(milk, milk.bestBeforeDate() // method differ
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate());
    }

    @Override
    public void visit(Butter butter) {
        checkBestBeforDate(butter, butter.expiryDate()); // method differ
    }

    private void checkBestBeforDate(FridgeElement element, LocalDate bestBeforeDate) {
        if (bestBeforeDate.isAfter(this.compareDate)) {
            System.out.println(element.getClass().getSimpleName());
        }
    }
}
