package hu.flowacademy.shoppinglist.repository;

import hu.flowacademy.shoppinglist.domain.ShoppingListItem;
import hu.flowacademy.shoppinglist.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShoppingListRepo extends JpaRepository<ShoppingListItem, String> {

    void deleteById(String id);

    @Query("SELECT COUNT(u) FROM ShoppingListItem u WHERE u.user.username = ?1")
    public Long sumListPerUser(@Param("user") String username);

    public List<ShoppingListItem> findByUser_UsernameStartingWith(String username);



}
