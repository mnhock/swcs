package swcs.gof.behavioral.chainofresponsibility.authentification;

public class BasicAuthenticationFilter extends AbstractAuthenticationFilter {

    @Override
    public boolean isAuthentificated(Authentification authentification) {
        if (authentification instanceof BasicAuthentification) {
            // logic
            return true;
        }

        return nextFilter(authentification);
    }
}