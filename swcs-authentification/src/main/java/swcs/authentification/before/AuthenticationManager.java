package swcs.authentification.before;

public class AuthenticationManager {

    private final SimpleAuthenticationProvider simpleAuthenticator = new SimpleAuthenticationProvider();

    public void login(User user) {
        this.simpleAuthenticator.authenticate(user);
    }
}
