package mate.academy.review.analysis.exceptions;

public class AuthenticationException extends Exception {
    public AuthenticationException(String message, Exception e) {
        super(message, e);
    }

    public AuthenticationException(String message) {
    }
}
