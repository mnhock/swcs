package swcs.dp.ocp.loanvalidator.before;

public class Tester {

    public static void main(String[] args) {
        LoanRequestHandler loanRequestHandler = new LoanRequestHandler(1001, 1);
        loanRequestHandler.approveLoan(new PersonalLoanValidator());
    }

}
