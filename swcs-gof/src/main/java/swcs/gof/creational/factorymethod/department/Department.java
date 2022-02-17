package swcs.gof.creational.factorymethod.department;

public abstract class Department {

    protected abstract Employee createEmployee(int id);

    public void fire(int id) {
        Employee employee = createEmployee(id);

        employee.paySalary();
        employee.dismiss();
    }

}
