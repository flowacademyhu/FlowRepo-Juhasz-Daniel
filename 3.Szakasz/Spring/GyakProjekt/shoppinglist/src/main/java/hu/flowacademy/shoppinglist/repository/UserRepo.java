package hu.flowacademy.shoppinglist.repository;

import hu.flowacademy.shoppinglist.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

    void deleteById(String id);
}
