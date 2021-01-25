package swcs.gof.behavioral.composite.organizationchart;

import java.util.ArrayList;
import java.util.List;

public abstract class DisciplinaryLeadership implements Employee {

    private final List<Employee> employees = new ArrayList<>();

    @Override
    public void draw() {
        for (Employee employee : this.employees) {
            employee.draw();
        }
    }

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    public Employee get(int index) {
        return this.employees.get(index);
    }
}
