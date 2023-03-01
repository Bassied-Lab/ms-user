package az.bassied.ms.user.dao.repos;

import az.bassied.ms.user.dao.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
