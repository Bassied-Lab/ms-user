package az.bassied.ms.user.dao.entities;

import az.bassied.ms.user.model.enums.UserRole;
import az.bassied.ms.user.model.enums.UserStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users", schema = "public")
public class UserEntity extends BaseEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 3;

    private String firstName;

    private String lastName;

    private String email;

    private String verifier;

    private String salt;

    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;

    @Enumerated(EnumType.STRING)
    private UserStatus status = UserStatus.CREATED;

}
