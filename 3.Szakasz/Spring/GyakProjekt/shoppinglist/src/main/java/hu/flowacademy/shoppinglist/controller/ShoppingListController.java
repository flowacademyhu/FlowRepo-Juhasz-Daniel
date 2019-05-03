package hu.flowacademy.shoppinglist.controller;

import hu.flowacademy.shoppinglist.domain.ShoppingListItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/shoppinglist")
public class ShoppingListController {

    private Map<String, ShoppingListItem> list = new HashMap<>();

    //@PostMapping("/add")
    //public ResponseEntity<ShoppingListItem> addToList(@RequestBody ShoppingListItem shoppingListItem){
      //  list.put(shoppingListItem.getId(), shoppingListItem);
       // return ResponseEntity.ok(shoppingListItem);
    //}

    @PostMapping("/add")
    public ResponseEntity<List<ShoppingListItem>> addToList(@RequestBody List<ShoppingListItem> shoppingList){
        for(ShoppingListItem item : shoppingList){
            list.put(item.getId(), item);
        }
        return ResponseEntity.ok(shoppingList);
    }

    @PutMapping("/update")
    public ResponseEntity<ShoppingListItem> updateList(@RequestBody ShoppingListItem shoppingListItem){
        ShoppingListItem foundedItem = list.get(shoppingListItem.getId());
        if ( foundedItem != null) {
            list.remove(shoppingListItem.getId());
            list.put(shoppingListItem.getId(), shoppingListItem);
            return ResponseEntity.ok(shoppingListItem);
        }
        return ResponseEntity.ok(new ShoppingListItem());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFromList(@PathVariable String id) {
        list.remove(id);
        return ResponseEntity.ok(id);
    }

    @GetMapping("/list-shoppinglist")
    public ResponseEntity<List<ShoppingListItem>> listShoppingList() {
        List<ShoppingListItem> shoppingList = new ArrayList<>(list.values());
        return ResponseEntity.ok(shoppingList);
    }

    @GetMapping("/list-shoppinglist/{id}")
    public ResponseEntity<ShoppingListItem> listShoppingListByID(@PathVariable String id) {
        ShoppingListItem item = list.get(id);
        return ResponseEntity.ok(item);
    }

    @GetMapping("/sumprice")
    public ResponseEntity<Integer> sumAllItemsPrice() {
        List<ShoppingListItem> listForPrices = new ArrayList<>(list.values());
        int sum = 0;
        for (ShoppingListItem item: listForPrices) {
            sum += item.getPrice();
        }
        return ResponseEntity.ok(sum);
    }

}
