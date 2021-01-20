package swcs.gof.behavioral.chainofresponsibility.purchase;

public class VP extends AbstractEmployee {

    @Override
    public void authorize(Purchase purchase) {
        if (purchase.getAmount() > 10_000d && purchase.getAmount() < 100_000d) {
            System.out.println("VP");
        } else {
            getNext().authorize(purchase);
        }
    }
}
