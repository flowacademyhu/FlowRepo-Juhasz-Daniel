package hu.flowacademy.shoppinglist.repository;

import hu.flowacademy.shoppinglist.Exceptions.ShoppingListItemNotFoundException;
import hu.flowacademy.shoppinglist.domain.ShoppingListItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ShoppingListRepository {

    private Map<String, ShoppingListItem> list = new HashMap<>();

    public List<ShoppingListItem> save(List<ShoppingListItem> savelist) {
        for (ShoppingListItem item: savelist) {
            if (item.getId() != null) {
                list.remove(item.getId());
                list.put(item.getId(), item);
            } else {
                list.put(item.getId(), item);
            }
        }
        return savelist;
    }

    public String delete(String id) {
        if (list.get(id) == null) {
            throw new ShoppingListItemNotFoundException(id);
        }
        list.remove(id);
        return id;
    }

    public List<ShoppingListItem> get() {
        List<ShoppingListItem> getlist = new ArrayList<>(list.values());
        return getlist;
    }

    public ShoppingListItem getById(String id) {
        if (list.get(id) == null) {
            throw new ShoppingListItemNotFoundException(id);
        }
        return list.get(id);
    }

    public Integer sum() {
        List<ShoppingListItem> newlist = new ArrayList<>(list.values());
        int sum = 0;
        for (ShoppingListItem item : newlist) {
            sum += item.getPrice();
        }
        return sum;
    }

}
