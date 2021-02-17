package swcs.gof.creational.builder.meal;

public class Meal {

    private String drink;
    private String main;
    private String dessert;

    public String drink() {
        return this.drink;
    }

    public void drink(String drink) {
        this.drink = drink;
    }

    public String main() {
        return this.main;
    }

    public void main(String main) {
        this.main = main;
    }

    public String dessert() {
        return this.dessert;
    }

    public void dessert(String dessert) {
        this.dessert = dessert;
    }

}
