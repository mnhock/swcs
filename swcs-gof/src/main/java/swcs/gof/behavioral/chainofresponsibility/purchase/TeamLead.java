package swcs.gof.behavioral.chainofresponsibility.purchase;

public class TeamLead extends AbstractEmployee {

    @Override
    public void authorize(Purchase purchase) {
        if (purchase.getAmount() <= 10_000d) {
            System.out.println("TeamLead");
        } else {
            getNext().authorize(purchase);
        }
    }
}