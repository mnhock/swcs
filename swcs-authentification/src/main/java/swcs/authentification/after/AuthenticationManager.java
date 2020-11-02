package swcs.authentification.after;

public class AuthenticationManager {

    private final AuthenticationProvider provider;

    public AuthenticationManager(AuthenticationProvider provider) {
        this.provider = provider;
    }

    public void login(Authentication authentication) {
        this.provider.authenticate(authentication);
    }
}
