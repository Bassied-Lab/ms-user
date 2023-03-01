package az.bassied.ms.user.error.exceptions;

public class ValidationException extends GeneralException {
    public ValidationException(String code, String message) {
        super(code, message);
    }
}
