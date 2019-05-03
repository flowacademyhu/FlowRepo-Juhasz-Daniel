package hu.flowacademy.shoppinglist.Service;

import hu.flowacademy.shoppinglist.domain.ShoppingListItem;
import hu.flowacademy.shoppinglist.repository.ShoppingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingListService {

    @Autowired
    public ShoppingListRepository repository;

    public List<ShoppingListItem> save(List<ShoppingListItem> savelist) {
        return repository.save(savelist);
    };

    public String delete(String id) {
        return repository.delete(id);
    }

    public List<ShoppingListItem> get() {
        return repository.get();
    }

    public ShoppingListItem getById(String id) {
        return repository.getById(id);
    }

    public Integer sum() {
        return repository.sum();
    }

}
