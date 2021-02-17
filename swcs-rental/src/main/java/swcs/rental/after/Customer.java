package swcs.rental.after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class Customer implements Iterable<Rental> {

    private final String name;
    private final List<Rental> rentals;

    Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public String name() {
        return this.name;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public double totalAmout() {
        return this.rentals
                .stream()
                .mapToDouble(Rental::charge)
                .sum();
    }

    public void overview() {
        System.out.format("Rental Record for %s%n", name());

        this.rentals.forEach(r -> System.out.format("\t%s\t%d%n", r.movie().title(), r.days()));

        System.out.format("Amount owed is %.2f%n", totalAmout());
    }

    @Override
    public Iterator<Rental> iterator() {
        return this.rentals.iterator();
    }
}