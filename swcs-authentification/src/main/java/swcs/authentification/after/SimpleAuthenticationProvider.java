package swcs.authentification.after;

public class SimpleAuthenticationProvider implements AuthenticationProvider {

    @Override
    public boolean authenticate(Authentication authentication) {
        // logic
        return true;
    }
}
