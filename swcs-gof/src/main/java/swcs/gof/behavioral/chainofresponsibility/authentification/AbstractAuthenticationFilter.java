package swcs.gof.behavioral.chainofresponsibility.authentification;

public abstract class AbstractAuthenticationFilter implements AuthenticationFilter {

    private AuthenticationFilter nextFilter;

    @Override
    public void setNextFilter(AuthenticationFilter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public boolean nextFilter(Authentification authentification) {
        if (this.nextFilter != null) {
            return this.nextFilter.isAuthentificated(authentification);
        }

        return false;
    }
}
