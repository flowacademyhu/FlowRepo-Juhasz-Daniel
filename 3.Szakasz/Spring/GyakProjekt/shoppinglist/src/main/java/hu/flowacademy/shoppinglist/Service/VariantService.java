package hu.flowacademy.shoppinglist.Service;

import hu.flowacademy.shoppinglist.Exceptions.ShoppingListItemNotFoundException;
import hu.flowacademy.shoppinglist.domain.ShoppingListItem;
import hu.flowacademy.shoppinglist.domain.Variant;
import hu.flowacademy.shoppinglist.repository.ShoppingListRepo;
import hu.flowacademy.shoppinglist.repository.VariantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class VariantService {

    @Autowired
    private VariantRepo variantRepoRepo;

    @Autowired
    private ShoppingListRepo shoppingListRepo;

    public List<Variant> getById(long id){
        return variantRepoRepo.findByShoppingListItem_Id(id);
    }

   public Variant save(Variant variant){
        Optional<ShoppingListItem> shoppingListItem = shoppingListRepo.findById(variant.getShoppingListItemId());
        if(shoppingListItem.isPresent()) {
            variant.setShoppingListItem((shoppingListItem.get()));
            return variantRepoRepo.save(variant);
        }
        throw new ShoppingListItemNotFoundException(variant.getShoppingListItemId());
    }

}
