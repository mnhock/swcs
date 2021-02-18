package swcs.gof.behavioral.chainofresponsibility.authentication;

public class BasicAuthenticationFilter extends AbstractAuthenticationFilter {

    @Override
    public boolean isAuthentificated(Authentication authentication) {
        if (authentication instanceof BasicAuthentication) {
            // logic
            return true;
        }

        return nextFilter(authentication);
    }
}