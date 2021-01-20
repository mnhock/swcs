package swcs.gof.behavioral.chainofresponsibility.purchase;

public class Client {

    public static void main(String[] args) {
        Employee cto = new CTO();
        Employee vp = new VP();
        Employee teamLead = new TeamLead();

        teamLead.next(vp);
        vp.next(cto);

        teamLead.authorize(new Purchase(100));     // TeamLead
        teamLead.authorize(new Purchase(99_999));  // VP
        teamLead.authorize(new Purchase(500_000)); // CTO
    }
}