package swcs.rental.after;

public class Tester {

    public static void main(String[] args) {
        Customer customer = new Customer("Better Coder");
        customer.addRental(new Rental(new NewReleaseMovie("Clean Code"), 2));
        customer.addRental(new Rental(new ChildrenMovie("Java"), 1));

        customer.overview();
    }
}
