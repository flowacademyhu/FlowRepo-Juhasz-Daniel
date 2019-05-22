package hu.flowacademy.Badge.repository;

import hu.flowacademy.Badge.domain.Badge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BadgeRepository extends JpaRepository<Badge, String> {

    public String findByName(String name);

}
