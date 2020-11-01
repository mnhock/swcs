package swcs.dp.ocp.loadvalidator.after;

public class BusinessLoanValidator implements Validator {
    @Override
    public boolean isValid(int balance) {
        return balance > 5000;
    }
}
