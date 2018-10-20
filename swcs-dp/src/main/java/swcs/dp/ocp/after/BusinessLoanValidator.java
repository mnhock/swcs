package swcs.dp.ocp.after;

public class BusinessLoanValidator implements Validator {
    @Override
    public boolean isValid(int balance) {
        return balance > 5000;
    }
}
