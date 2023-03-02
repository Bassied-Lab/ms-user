package az.bassied.ms.user.service.impl;

import az.bassied.ms.user.dao.entities.UserEntity;
import az.bassied.ms.user.dao.repos.UserRepository;
import az.bassied.ms.user.error.exceptions.NotFoundException;
import az.bassied.ms.user.error.exceptions.ValidationException;
import az.bassied.ms.user.mapper.UserMapper;
import az.bassied.ms.user.model.common.SignUpDTO;
import az.bassied.ms.user.model.common.UserDTO;
import az.bassied.ms.user.model.consts.Messages;
import az.bassied.ms.user.model.enums.UserStatus;
import az.bassied.ms.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository repo;

    private final UserMapper mapper;

    @Override
    public UserDTO create(SignUpDTO request) {
        logger.info("Action.create.start");
        if (repo.findByEmail(request.email().toLowerCase()).isPresent()) {
            throw new ValidationException(Messages.USER_EXIST, Messages.USER_EXIST_MSG);
        }
        UserEntity user = repo.save(mapper.signUpDtoToEntity(request));
        logger.info("Action.create.end");
        return mapper.entityToDTO(user);
    }

    @Override
    public UserDTO activate(String email) {
        logger.info("Action.activate.start");
        UserEntity user = repo.findByEmailAndStatus(email.toLowerCase(), UserStatus.CREATED)
                .orElseThrow(() -> new NotFoundException(Messages.USER_NOT_FOUND, Messages.USER_NOT_FOUND_MSG));
        user.setStatus(UserStatus.ACTIVE);
        user = repo.save(user);
        logger.info("Action.activate.end");
        return mapper.entityToDTO(user);
    }

    @Override
    public UserDTO getByEmail(String email) {
        logger.info("Action.getByEmail.start");
        UserEntity user = repo.findByEmail(email.toLowerCase())
                .orElseThrow(() -> new NotFoundException(Messages.USER_NOT_FOUND, Messages.USER_NOT_FOUND_MSG));
        logger.info("Action.getByEmail.end");
        return mapper.entityToDTO(user);
    }
}
