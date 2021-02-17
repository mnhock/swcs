package swcs.gof.behavioral.chainofresponsibility.purchase;

public class TeamLead extends AbstractEmployee {

    @Override
    public void authorize(Purchase purchase) {
        if (purchase.amount() <= 10_000d) {
            System.out.println("TeamLead");
        } else {
            next().authorize(purchase);
        }
    }
}