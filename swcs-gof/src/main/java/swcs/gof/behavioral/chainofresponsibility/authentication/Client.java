package swcs.gof.behavioral.chainofresponsibility.authentication;

class Client {

    public static void main(String[] args) {
        AuthenticationFilter digestFilter = new DigestAuthenticationFilter();
        AuthenticationFilter bearerFilter = new BearerAuthenticationFilter();
        AuthenticationFilter basicFilter = new BasicAuthenticationFilter();

        digestFilter.setNextFilter(bearerFilter);
        bearerFilter.setNextFilter(basicFilter);

        System.out.println(digestFilter.isAuthenticated(new BearerAuthentication()));  // true
    }
}
