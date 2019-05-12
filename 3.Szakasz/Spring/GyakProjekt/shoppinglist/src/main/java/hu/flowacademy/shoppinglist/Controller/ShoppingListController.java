package hu.flowacademy.shoppinglist.Controller;

import hu.flowacademy.shoppinglist.Service.ShoppingListService;
import hu.flowacademy.shoppinglist.domain.ShoppingListItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shoppinglist")
public class ShoppingListController {

    @Autowired
    public ShoppingListService service;

    //kész
    @PostMapping("/add")
    public ResponseEntity<ShoppingListItem> addToList(@RequestBody ShoppingListItem shoppingList) {
        return ResponseEntity.ok(service.save(shoppingList));
    }

    //kész
    @PutMapping("/update")
    public ResponseEntity<ShoppingListItem> updateList(@RequestBody ShoppingListItem shoppingList) {
        return ResponseEntity.ok(service.save(shoppingList));
    }

    //kész
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFromList(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    //kész
    @GetMapping("/get")
    public ResponseEntity<List<ShoppingListItem>> getList() {
        return ResponseEntity.ok(service.get());
    }

    //kész
    @GetMapping("/get/{id}")
    public ResponseEntity<ShoppingListItem> getById (@PathVariable String id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping("/list-per-user/{username}")
    public ResponseEntity<Long> getSumListPerUser(@PathVariable String username ) {
        return ResponseEntity.ok(service.sumListPerUser(username));
    }

    @GetMapping("/list-of-user/{username}")
    public ResponseEntity<List<ShoppingListItem>> getShoppingListItems(@PathVariable String username) {
        return ResponseEntity.ok(service.getItems(username));
    }



    /*@GetMapping("/sumprice")
    public ResponseEntity<Integer> sumPrice () {
        return ResponseEntity.ok(service.sum());
    }*/

}
