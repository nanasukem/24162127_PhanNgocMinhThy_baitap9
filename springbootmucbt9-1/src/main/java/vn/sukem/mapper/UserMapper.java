package vn.sukem.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import vn.sukem.dto.UserDTO;
import vn.sukem.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
	@Mapping(target = "roleName", source = "role.name")
	UserDTO toDTO(User user);
}
