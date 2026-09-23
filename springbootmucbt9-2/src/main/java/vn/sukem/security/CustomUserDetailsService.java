package vn.sukem.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import vn.sukem.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
	private final UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {
		return userRepository.findByUsername(username).map(CustomUserDetails::new)
				.orElseThrow(() -> new UsernameNotFoundException("Username không tồn tại"));
	}
}