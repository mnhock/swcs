package swcs.dp.ocp.humanresource.before;

import java.util.ArrayList;
import java.util.List;

public class HumanResourceDepartment {

    private final List<Developer> developers;
    private final List<Manager> managers;

    public HumanResourceDepartment() {
        this.developers = new ArrayList<>();
        this.managers = new ArrayList<>();
    }

    public void hire(Developer developer) {
        developer.signContract();
        this.developers.add(developer);
    }

    public void hire(Manager manager) {
        manager.signContract();
        this.managers.add(manager);
    }
}
