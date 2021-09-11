package swcs.gof.behavioral.chainofresponsibility.authentication;

public interface AuthenticationFilter {

    boolean isAuthenticated(Authentication authentication);

    void setNextFilter(AuthenticationFilter nextFilter);

}