package swcs.gof.behavioral.chainofresponsibility.authentication;

public abstract class AbstractAuthenticationFilter implements AuthenticationFilter {

    private AuthenticationFilter nextFilter;

    @Override
    public void setNextFilter(AuthenticationFilter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public boolean nextFilter(Authentication authentication) {
        if (this.nextFilter != null) {
            return this.nextFilter.isAuthenticated(authentication);
        }

        return false;
    }
}
