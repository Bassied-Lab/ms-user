package az.bassied.ms.user.model.common;

public record UserDTO(
        Long id,
        String firstName,
        String lastName,
        String email,
        String verifier,
        String salt) {


}
