package swcs.dp.ocp.before;

public class PersonalLoanValidator {

    public boolean isValid(int balance) {
        return balance > 1000 ? true : false;
    }
}
