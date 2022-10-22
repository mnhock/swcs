package swcs.dp.ocp.loanvalidator.before;

public final class PersonalLoanValidator {

    public boolean isValid(int balance) {
        return balance > 1000;
    }
}
