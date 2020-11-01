package swcs.dp.ocp.loadvalidator.after;

public class PersonalLoanValidator implements Validator {
    @Override
    public boolean isValid(int balance) {
        return balance > 1000;
    }
}
