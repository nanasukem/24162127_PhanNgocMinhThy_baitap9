package vn.sukem.service.impl;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import vn.sukem.dto.UserDTO;
import vn.sukem.entity.User;
import vn.sukem.mapper.UserMapper;
import vn.sukem.repository.UserRepository;
import vn.sukem.service.UserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;
	private final UserMapper userMapper;

	@Override
	public UserDTO findById(Long id) {
		User user = userRepository.findById(id).orElseThrow();
		return userMapper.toDTO(user);
	}
}
