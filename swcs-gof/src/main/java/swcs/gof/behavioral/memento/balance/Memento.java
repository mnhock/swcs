package swcs.gof.behavioral.memento.balance;

public final class Memento {

    private final Double balance;

    public Memento(Double balance) {
        this.balance = balance;
    }

    public Double balance() {
        return this.balance;
    }
}