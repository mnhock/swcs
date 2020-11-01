package swcs.gof.creational.factorymethod.department;

public class TechDepartment extends Department {

    @Override
    public Employee createEmployee(int id) {
        return new Programmer(id);
    }
}
