package hu.flowacademy.Badge.repository;

import hu.flowacademy.Badge.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {



}
