package vn.sukem.service;

import vn.sukem.dto.UserDTO;

public interface UserService {
	UserDTO findById(Long id);
}
