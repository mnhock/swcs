package swcs.gof.behavioral.strategy.order;

public class OrderProcessor {

    private final PaymentStrategy paymentStrategy;

    public OrderProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(Order order) {
        this.paymentStrategy.pay(order);
    }
}