package swcs.gof.behavioral.chainofresponsibility.purchase;

public abstract class AbstractEmployee implements Employee {

    private Employee nextEmployee;

    @Override
    public void next(Employee nextEmployee) {
        this.nextEmployee = nextEmployee;
    }

    public Employee next() {
        return this.nextEmployee;
    }
}
