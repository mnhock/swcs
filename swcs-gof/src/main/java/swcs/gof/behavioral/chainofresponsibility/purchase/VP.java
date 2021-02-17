package swcs.gof.behavioral.chainofresponsibility.purchase;

public class VP extends AbstractEmployee {

    @Override
    public void authorize(Purchase purchase) {
        if (purchase.amount() > 10_000d && purchase.amount() < 100_000d) {
            System.out.println("VP");
        } else {
            next().authorize(purchase);
        }
    }
}
