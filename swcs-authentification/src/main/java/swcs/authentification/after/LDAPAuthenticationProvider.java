package swcs.authentification.after;

public class LDAPAuthenticationProvider implements AuthenticationProvider {

    @Override
    public boolean authenticate(User user) {
        // logic
        return true;
    }
}
