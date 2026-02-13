package swcs.authentication.before;

public class AuthenticationManager {

    private final DatabaseAuthenticationProvider provider = new DatabaseAuthenticationProvider();

    public boolean login(User user) {
        return this.provider.authenticate(user);
    }
}
