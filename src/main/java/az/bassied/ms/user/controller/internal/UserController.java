package az.bassied.ms.user.controller.internal;

import az.bassied.ms.user.service.UserService;
import az.bassied.ms.user.model.common.SignUpDTO;
import az.bassied.ms.user.model.consts.URLs;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(URLs.ROOT)
public class UserController {

    private final UserService service;

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody @Valid SignUpDTO request) {
        service.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
