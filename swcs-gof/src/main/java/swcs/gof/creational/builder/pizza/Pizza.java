package swcs.gof.creational.builder.pizza;

final class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public void dough(String dough) {
        this.dough = dough;
    }

    public void sauce(String sauce) {
        this.sauce = sauce;
    }

    public void topping(String topping) {
        this.topping = topping;
    }
}