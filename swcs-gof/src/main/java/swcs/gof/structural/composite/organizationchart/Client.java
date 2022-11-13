package swcs.gof.structural.composite.organizationchart;

public class Client {
    public static void main(String[] args) {

        DisciplinaryLeadership cto = new CTO();
        DisciplinaryLeadership vp1 = new VP();
        DisciplinaryLeadership vp2 = new VP();

        vp1.add(new Developer());
        vp1.add(new Developer());

        vp2.add(new Developer());
        vp2.add(new Developer());
        vp2.add(new Developer());

        cto.add(vp1);
        cto.add(vp2);

        cto.draw();
    }
}
