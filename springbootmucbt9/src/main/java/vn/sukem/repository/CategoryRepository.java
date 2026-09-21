package vn.sukem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.sukem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}