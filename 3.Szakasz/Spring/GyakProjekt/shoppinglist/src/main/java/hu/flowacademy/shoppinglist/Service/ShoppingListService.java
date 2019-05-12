package hu.flowacademy.shoppinglist.Service;

import hu.flowacademy.shoppinglist.Exceptions.ShoppingListItemNotFoundException;
import hu.flowacademy.shoppinglist.domain.ShoppingListItem;
import hu.flowacademy.shoppinglist.domain.User;
import hu.flowacademy.shoppinglist.repository.ShoppingListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShoppingListService {

    @Autowired
    public ShoppingListRepo repository;

    public ShoppingListItem save(ShoppingListItem item) {
            return repository.save(item);
    };

    public void delete(String id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ShoppingListItemNotFoundException(id);
        }
    }

    public List<ShoppingListItem> get() {
        return repository.findAll();
    }

    public ShoppingListItem getById(String id) {
        if (repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        }
        throw new ShoppingListItemNotFoundException(id);
    }

    public Long sumListPerUser(String username) {
        return repository.sumListPerUser(username);
    }

    public List<ShoppingListItem> getItems(String username) {
        return repository.findByUser_UsernameStartingWith(username);
    }




   /* public Integer sum() {
        return repository.sum();
    }*/

}
