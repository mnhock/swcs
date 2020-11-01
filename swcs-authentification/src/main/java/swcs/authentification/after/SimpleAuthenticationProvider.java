package swcs.authentification.after;

public class SimpleAuthenticationProvider implements AuthenticationProvider {

    @Override
    public boolean authenticate(User user) {
        // logic
        return true;
    }
}
