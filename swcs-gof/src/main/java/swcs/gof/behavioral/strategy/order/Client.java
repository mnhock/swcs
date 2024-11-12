package swcs.gof.behavioral.strategy.order;

class Client {

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor(new CreditCardPayment());
        processor.processOrder(new Order(1));
    }
}
