package az.bassied.ms.user.dao.repos;

import az.bassied.ms.user.dao.entities.UserEntity;
import az.bassied.ms.user.model.enums.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);

    Optional<UserEntity> findByEmailAndStatus(String email, UserStatus status);
}
