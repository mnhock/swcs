package swcs.gof.creational.factorymethod.department;

public class Programmer implements Employee {

    private final int id;

    public Programmer(int id) {
        this.id = id;
    }

    @Override
    public void paySalary() {
    }

    @Override
    public void dismiss() {
    }

}
