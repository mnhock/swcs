package swcs.dp.srp.product.before;

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

    public double calculateDiscount() {
        // Calculate the discount for the product.
        return 0.0;
    }
}
