package swcs.gof.behavioral.chainofresponsibility.purchase;

public class CTO extends AbstractEmployee {

    @Override
    public void authorize(Purchase purchase) {
        if (purchase.amount() > 100_000d) {
            System.out.println("CTO");
        } else {
            next().authorize(purchase);
        }
    }
}
