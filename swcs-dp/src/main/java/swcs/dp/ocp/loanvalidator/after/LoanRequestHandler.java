package swcs.dp.ocp.loanvalidator.after;

public class LoanRequestHandler {
    private final int balance;
    private final int period;

    public LoanRequestHandler(int balance, int period) {
        this.balance = balance;
        this.period = period;
    }

    public void approveLoan(Validator validator) {
        if (validator.isValid(this.balance)) {
            System.out.println("Loan approved...");
        } else {
            System.out.println("Sorry not enough balance...");
        }
    }
}