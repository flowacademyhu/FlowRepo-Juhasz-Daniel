package hu.flowacademy.shoppinglist.repository;

import hu.flowacademy.shoppinglist.domain.Variant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VariantRepo extends JpaRepository<Variant, Long> {

    List<Variant> findByShoppingListItem_Id(long id);

}
