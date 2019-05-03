package hu.flowacademy.shoppinglist.controller;

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

    @PostMapping("/add")
    public ResponseEntity<List<ShoppingListItem>> addToList(@RequestBody List<ShoppingListItem> shoppingList) {
        return ResponseEntity.ok(service.save(shoppingList));
    }

    @PutMapping("/update")
    public ResponseEntity<List<ShoppingListItem>> updateList(@RequestBody List<ShoppingListItem> shoppingList) {
        return ResponseEntity.ok(service.save(shoppingList));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFromList(@PathVariable String id) {
        return ResponseEntity.ok(service.delete(id));
    }

    @GetMapping("/get")
    public ResponseEntity<List<ShoppingListItem>> getList() {
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ShoppingListItem> getById (@PathVariable String id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping("/sumprice")
    public ResponseEntity<Integer> sumPrice () {
        return ResponseEntity.ok(service.sum());
    }

}
