package hu.flowacademy.shoppinglist.repository;

import hu.flowacademy.shoppinglist.domain.ShoppingListItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingListRepo extends JpaRepository<ShoppingListItem, String> {

    void deleteById(String id);
}
