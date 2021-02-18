package swcs.gof.behavioral.chainofresponsibility.authentication;

public class BearerAuthenticationFilter extends AbstractAuthenticationFilter {

    @Override
    public boolean isAuthentificated(Authentication authentication) {
        if (authentication instanceof BearerAuthentication) {
            // logic
            return true;
        }

        return nextFilter(authentication);
    }
}