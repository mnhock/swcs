package swcs.authentification.after;

public class LDAPAuthenticationProvider implements AuthenticationProvider {

    @Override
    public boolean authenticate(Authentication authentication) {
        // logic
        return true;
    }
}
