package swcs.dp.ocp.humanresource.after;

import java.util.ArrayList;
import java.util.List;

public class HumanResourceDepartment {
    private final List<Employee> employees;

    public HumanResourceDepartment() {
        this.employees = new ArrayList<>();
    }

    public void hire(Employee employee) {
        employee.signContract();
        this.employees.add(employee);
    }
}
