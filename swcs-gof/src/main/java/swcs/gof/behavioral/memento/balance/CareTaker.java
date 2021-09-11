package swcs.gof.behavioral.memento.balance;

import java.util.Stack;

public final class CareTaker {

    private final Stack<Memento> history;

    public CareTaker() {
        this.history = new Stack<>();
    }

    public void push(Memento state) {
        this.history.push(state);
    }

    public Memento pop() {
        return this.history.pop();
    }
}