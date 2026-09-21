package vn.sukem.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import vn.sukem.entity.User;
import vn.sukem.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class AuthService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	public boolean checkLogin(String email, String rawPassword) {
		User user = userRepository.findByEmailIgnoreCase(email).orElse(null);
		if (user == null || !user.isEnabled()) {
			return false;
		}
		return passwordEncoder.matches(rawPassword, user.getPassword());
	}
}