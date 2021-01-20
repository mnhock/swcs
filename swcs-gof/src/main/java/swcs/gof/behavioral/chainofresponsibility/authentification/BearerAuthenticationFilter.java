package swcs.gof.behavioral.chainofresponsibility.authentification;

public class BearerAuthenticationFilter extends AbstractAuthenticationFilter {

    @Override
    public boolean isAuthentificated(Authentification authentification) {
        if (authentification instanceof BearerAuthentication) {
            // logic
            return true;
        }

        return nextFilter(authentification);
    }
}