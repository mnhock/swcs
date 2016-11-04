package swcs.dp.ocp.after;

public class PersonalLoanValidator implements Validator {
    public boolean isValid(int balance) {
        return balance > 1000 ? true : false;
    }
}
