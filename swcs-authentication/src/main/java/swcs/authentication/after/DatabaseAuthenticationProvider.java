package swcs.authentication.after;

public class DatabaseAuthenticationProvider implements AuthenticationProvider {

    @Override
    public boolean authenticate(Authentication authentication) {
        // logic
        return true;
    }
}
