package az.bassied.ms.user.model.common;

import az.bassied.ms.user.model.enums.UserRole;
import az.bassied.ms.user.model.enums.UserStatus;

public record UserDTO(
        Long id,
        String firstName,
        String lastName,
        String email,
        UserStatus status,
        UserRole role,
        String verifier,
        String salt) {

}
