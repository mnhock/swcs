package swcs.gof.behavioral.chainofresponsibility.authentification;

public interface AuthenticationFilter {

    boolean isAuthentificated(Authentification authentification);

    void setNextFilter(AuthenticationFilter nextFilter);

}