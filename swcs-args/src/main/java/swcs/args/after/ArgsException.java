package swcs.args.after;

public class ArgsException extends Exception {

    private static final long serialVersionUID = 1L;
    
    private char errorArgumentId = '\0';
    private String errorParameter = null;
    private ErrorCode errorCode = ErrorCode.OK;

    public ArgsException(String message) {
        super(message);
    }

    public ArgsException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ArgsException(ErrorCode errorCode, String errorParameter) {
        this.errorCode = errorCode;
        this.errorParameter = errorParameter;
    }

    public ArgsException(ErrorCode errorCode, char errorArgumentId, String errorParameter) {
        this.errorCode = errorCode;
        this.errorParameter = errorParameter;
        this.errorArgumentId = errorArgumentId;
    }

    public char getErrorArgumentId() {
        return this.errorArgumentId;
    }

    public void setErrorArgumentId(char errorArgumentId) {
        this.errorArgumentId = errorArgumentId;
    }

    public String getErrorParameter() {
        return this.errorParameter;
    }

    public void setErrorParameter(String errorParameter) {
        this.errorParameter = errorParameter;
    }

    public ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public String errorMessage() {
        switch (this.errorCode) {
        case OK:
            return "TILT: Should not get here.";
        case UNEXPECTED_ARGUMENT:
            return String.format("Argument -%c unexpected.", this.errorArgumentId);
        case MISSING_STRING:
            return String.format("Could not find string parameter for -%c.", this.errorArgumentId);
        case INVALID_INTEGER:
            return String.format("Argument -%c expects an integer but was '%s'.", this.errorArgumentId, this.errorParameter);
        case MISSING_INTEGER:
            return String.format("Could not find integer parameter for -%c.", this.errorArgumentId);
        case MISSING_BOOLEAN:
            return String.format("Could not find boolean parameter for -%c.", this.errorArgumentId);
        case INVALID_ARGUMENT_NAME:
            return String.format("'%c' is not a valid argument name.", this.errorArgumentId);
        case INVALID_ARGUMENT_FORMAT:
            return String.format("'%s' is not a valid argument format.", this.errorParameter);
        }
        return "";
    }

    @Override
    public String getMessage() {
        return errorMessage();
    }

    public enum ErrorCode {
        OK, INVALID_ARGUMENT_FORMAT, UNEXPECTED_ARGUMENT, INVALID_ARGUMENT_NAME, MISSING_STRING, MISSING_INTEGER, INVALID_INTEGER, MISSING_BOOLEAN
    }
}