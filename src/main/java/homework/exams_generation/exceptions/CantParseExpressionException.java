package homework.exams_generation.exceptions;

public class CantParseExpressionException extends RuntimeException {
    public CantParseExpressionException(String message) {
        super(message);
    }

    public CantParseExpressionException(Throwable cause) {
        super(cause);
    }
}
