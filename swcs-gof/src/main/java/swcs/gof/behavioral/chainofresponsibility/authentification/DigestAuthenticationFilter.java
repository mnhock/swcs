package swcs.gof.behavioral.chainofresponsibility.authentification;

public class DigestAuthenticationFilter extends AbstractAuthenticationFilter {

    @Override
    public boolean isAuthentificated(Authentification authentification) {
        if (authentification instanceof DigestAuthentification) {
            // logic
            return true;
        }

        return nextFilter(authentification);
    }
}