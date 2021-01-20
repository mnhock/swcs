package swcs.gof.behavioral.chainofresponsibility.authentification;

public class Client {

    public static void main(String[] args) {
        AuthenticationFilter digestFilter = new DigestAuthenticationFilter();
        AuthenticationFilter bearerFilter = new BearerAuthenticationFilter();
        AuthenticationFilter basicFilter = new BasicAuthenticationFilter();

        digestFilter.setNextFilter(bearerFilter);
        bearerFilter.setNextFilter(basicFilter);

        System.out.println(digestFilter.isAuthentificated(new BearerAuthentication()));  // true
    }
}
