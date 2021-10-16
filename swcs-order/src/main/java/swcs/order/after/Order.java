package swcs.order.after;

import java.util.Objects;

public final class Order {

    private final int id;

    public Order(int id) {
        this.id = id;
    }

    public Order(Importer source) {
        Objects.requireNonNull(source);

        Order order = source.importOrder();
        this.id = order.id;
    }

    public int id() {
        return this.id;
    }

    public void export(Exporter destination) {
        Objects.requireNonNull(destination);

        destination.exportOrder(this);
    }

}