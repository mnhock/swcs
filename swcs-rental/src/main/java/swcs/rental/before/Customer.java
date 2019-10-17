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

    public String getName() {
        return this.name;
    }

    public void statement() {
        double totalAmount = 0;

        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            //determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
            case Movie.CHILDREN:
                thisAmount += each.getDaysRented() * 1;

                break;
            case Movie.REGULAR:
                thisAmount += each.getDaysRented() * 2;

                break;
            case Movie.NEW_RELEASE:
                thisAmount += each.getDaysRented() * 3;
                break;

            }
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";

        System.out.println(result);
    }
}