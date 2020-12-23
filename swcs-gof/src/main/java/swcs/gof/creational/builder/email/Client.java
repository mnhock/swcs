package swcs.gof.creational.builder.email;

public class Client {

    public static void main(String[] args) {
        Email email = Email.builder()
                .addRecipient("bad@foo.com")
                .addRecipient("coder@foo.com")
                .withMessage("Your first Builder Pattern")
                .withSignature("Clean Coder")
                .build();

        email.send();
    }
}
