package az.bassied.ms.user.error.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public class GeneralException extends RuntimeException {
    private final String code;
    private final String message;
}
