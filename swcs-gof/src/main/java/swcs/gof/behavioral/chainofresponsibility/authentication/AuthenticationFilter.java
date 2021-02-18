package swcs.gof.behavioral.chainofresponsibility.authentication;

public interface AuthenticationFilter {

    boolean isAuthentificated(Authentication authentication);

    void setNextFilter(AuthenticationFilter nextFilter);

}