package swcs.dp.ocp.after;

public class BusinessLoanValidator implements Validator {
    public boolean isValid(int balance) {
        return balance > 5000 ? true : false;
    }
}
