package az.bassied.ms.user.controller.internal;

import az.bassied.ms.user.model.common.SignUpDTO;
import az.bassied.ms.user.model.common.UserDTO;
import az.bassied.ms.user.model.consts.URLs;
import az.bassied.ms.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(URLs.ROOT_INTERNAL)
public class UserController {

    private final UserService service;

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody @Valid SignUpDTO request) {
        return ResponseEntity.ok(service.create(request));
    }

    @PatchMapping(URLs.ACTIVATE_USER)
    public ResponseEntity<UserDTO> activate(@RequestParam String email) {
        return ResponseEntity.ok(service.activate(email));
    }
}
