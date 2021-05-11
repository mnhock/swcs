package swcs.rental.before;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private Vector rentals = new Vector();
    private String name;


    public void addRental(Rental arg) {
        this.rentals.addElement(arg);
    }

    public Customer(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public void statement() {
        double totalAmount = 0;

        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + name() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            // determine amounts for each line
            switch (each.movie().priceCode()) {
            case Movie.CHILDREN:
                thisAmount += each.daysRented();

                break;
            case Movie.REGULAR:
                thisAmount += each.daysRented() * 2;

                break;
            case Movie.NEW_RELEASE:
                thisAmount += each.daysRented() * 3;
                break;

            }
            // show figures for this rental
            result += "\t" + each.movie().title() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }
        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";

        System.out.println(result);
    }
}