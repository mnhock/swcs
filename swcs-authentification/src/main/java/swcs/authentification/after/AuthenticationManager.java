package swcs.authentification.after;

public class AuthenticationManager {

    private final AuthenticationProvider authenticationProvider;

    public AuthenticationManager(AuthenticationProvider authenticationProvider) {
        this.authenticationProvider = authenticationProvider;
    }

    public void login(User user) {
        this.authenticationProvider.authenticate(user);
    }
}
