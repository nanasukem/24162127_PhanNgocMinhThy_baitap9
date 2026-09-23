package vn.sukem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.sukem.entity.Role;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(String name);
}
