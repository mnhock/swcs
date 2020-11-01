package swcs.gof.creational.builder.email;

import java.util.HashSet;
import java.util.Set;

public class Email {

    private final String subject;
    private final String message;
    private final String recipients;

    private Email(String subject, String message, String recipients) {
        this.subject = subject;
        this.message = message;
        this.recipients = recipients;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getMessage() {
        return this.message;
    }

    public String getRecipients() {
        return this.recipients;
    }

    public void send() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private String subject;
        private String message;
        private String signature;
        private final Set<String> recipients;

        public Builder() {
            this.recipients = new HashSet<>();
        }

        public Builder withSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder withSignature(String signature) {
            this.signature = signature;
            return this;
        }

        public Builder addRecipient(String recipient) {
            this.recipients.add(recipient);
            return this;
        }

        public Builder removeRecipient(String recipient) {
            this.recipients.remove(recipient);
            return this;
        }

        public Email build() {
            return new Email(this.subject,
                    String.format("%s%n%s", this.message, this.signature),
                    String.join(".", this.recipients));
        }
    }
}