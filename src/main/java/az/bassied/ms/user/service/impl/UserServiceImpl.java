package az.bassied.ms.user.service.impl;

import az.bassied.ms.user.dao.entities.UserEntity;
import az.bassied.ms.user.dao.repos.UserRepository;
import az.bassied.ms.user.error.exceptions.UserAlreadyExistException;
import az.bassied.ms.user.mapper.UserMapper;
import az.bassied.ms.user.model.common.SignUpDTO;
import az.bassied.ms.user.model.common.UserDTO;
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
        if (repo.findByEmail(request.email()).isPresent()) {
            throw new UserAlreadyExistException();
        }
        logger.info(mapper.signUpDtoToEntity(request).getFirstName());
        UserEntity user = repo.save(mapper.signUpDtoToEntity(request));
        logger.info("Action.create.end");
        return mapper.entityToDTO(user);

    }
}
