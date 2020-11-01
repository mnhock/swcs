package swcs.gof.creational.factorymethod.department;

public class FactoryMethodTester {

    public static void main(String[] args) {
        Department department = new TechDepartment();
        department.fire(1);
    }
}