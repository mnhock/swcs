package swcs.gof.behavioral.chainofresponsibility.purchase;

public final class Purchase {

    private final double amount;

    public Purchase(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }
}
