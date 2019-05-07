package hu.flowacademy.shoppinglist.controller;

import hu.flowacademy.shoppinglist.Service.UserService;
import hu.flowacademy.shoppinglist.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/add")
    public ResponseEntity<User> addToList(@RequestBody User user) {
        return ResponseEntity.ok(service.save(user));
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateList(@RequestBody User user) {
        return ResponseEntity.ok(service.save(user));
    }

    @DeleteMapping("/delete/{username}")
    public ResponseEntity<Void> deleteFromList(@PathVariable String username) {
        service.delete(username);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/get")
    public ResponseEntity<List<User>> getList() {
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/get/{username}")
    public ResponseEntity<User> getById (@PathVariable String username) {
        return ResponseEntity.ok(service.getById(username));
    }



}
