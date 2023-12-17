package swcs.gof.creational.factorymethod.department;

class Client {

    public static void main(String[] args) {
        Department department = new TechDepartment();
        department.fire(1);
    }
}