package swcs.dp.srp.product.after;

class Product {

    private final String name;
    private final double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String name() {
        return this.name;
    }

    public double price() {
        return this.price;
    }
}
