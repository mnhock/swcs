package swcs.gof.behavioral.memento.balance;

public final class Originator {

    private Double balance;

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return this.balance;
    }

    public Memento save() {
        return new Memento(this.balance);
    }

    public void restore(Memento memento) {
        this.balance = memento.balance();
    }
}