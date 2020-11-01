package swcs.dp.ocp.loanvalidator.before;

public class PersonalLoanValidator {

    public boolean isValid(int balance) {
        return balance > 1000;
    }
}
