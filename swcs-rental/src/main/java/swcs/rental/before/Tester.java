package swcs.rental.before;

public class Tester {

    public static void main(String[] args) {
        Customer customer = new Customer("Bad Coder");
        customer.addRental(new Rental(new Movie("Clean Code", 2), Movie.NEW_RELEASE));
        customer.addRental(new Rental(new Movie("Java", 1), Movie.CHILDREN));

        customer.statement();
    }
}
