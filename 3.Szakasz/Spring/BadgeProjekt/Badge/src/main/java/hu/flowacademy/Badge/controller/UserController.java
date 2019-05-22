package hu.flowacademy.Badge.controller;

import hu.flowacademy.Badge.domain.User;
import hu.flowacademy.Badge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/get/{userName}")
    public ResponseEntity<User> getUser(@PathVariable String userName) {
        return ResponseEntity.ok(userService.findById(userName));
    }

    @PostMapping("/post")
    public ResponseEntity<User> postUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.post(user));
    }

    @PutMapping("/put")
    public ResponseEntity<User> putUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.update(user));
    }

    @DeleteMapping("/delete/{userName}")
    public ResponseEntity<Void> deleteUser(@PathVariable String userName) {
        userService.deleteUser(userName);
        return ResponseEntity.noContent().build();
    }
}
