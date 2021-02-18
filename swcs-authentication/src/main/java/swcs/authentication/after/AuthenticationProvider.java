package swcs.authentication.after;

public interface AuthenticationProvider {

    boolean authenticate(Authentication authentication);

}
