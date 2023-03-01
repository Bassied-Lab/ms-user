package az.bassied.ms.user.mapper;

import az.bassied.ms.user.dao.entities.UserEntity;
import az.bassied.ms.user.model.common.SignUpDTO;
import az.bassied.ms.user.model.common.UserDTO;
import org.mapstruct.Mapper;

import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = IGNORE)
public interface UserMapper {

    UserEntity signUpDtoToEntity(SignUpDTO dto);

    UserDTO entityToDTO(UserEntity entity);
}
