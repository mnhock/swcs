package swcs.gof.creational.factorymethod.department;

public class MarketingDepartment extends Department {

    @Override
    public Employee createEmployee(int id) {
        return new MarketingSpecialist(id);
    }
}
