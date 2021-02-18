package swcs.authentication.before;

public class AuthenticationManager {

    private final DatabaseAuthenticationProvider provider = new DatabaseAuthenticationProvider();

    public void login(User user) {
        this.provider.authenticate(user);
    }
}
