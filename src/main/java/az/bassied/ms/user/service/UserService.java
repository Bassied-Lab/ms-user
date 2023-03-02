package az.bassied.ms.user.service;


import az.bassied.ms.user.model.common.SignUpDTO;
import az.bassied.ms.user.model.common.UserDTO;

public interface UserService {

    UserDTO create(SignUpDTO request);

    UserDTO activate(String email);
}
