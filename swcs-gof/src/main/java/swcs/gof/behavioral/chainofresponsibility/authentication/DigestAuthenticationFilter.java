package swcs.gof.behavioral.chainofresponsibility.authentication;

public class DigestAuthenticationFilter extends AbstractAuthenticationFilter {

    @Override
    public boolean isAuthentificated(Authentication authentication) {
        if (authentication instanceof DigestAuthentication) {
            // logic
            return true;
        }

        return nextFilter(authentication);
    }
}