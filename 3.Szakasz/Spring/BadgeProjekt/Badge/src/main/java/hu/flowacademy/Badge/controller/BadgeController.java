package hu.flowacademy.Badge.controller;

import hu.flowacademy.Badge.domain.Badge;
import hu.flowacademy.Badge.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/badge")
public class BadgeController {

    @Autowired
    private BadgeService badgeService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Badge>> getAll() {
        return ResponseEntity.ok(badgeService.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Badge> getUser(@PathVariable String id) {
        return ResponseEntity.ok(badgeService.findById(id));
    }

    @PostMapping("/post")
    public ResponseEntity<Badge> postUser(@RequestBody Badge user) {
        return ResponseEntity.ok(badgeService.post(user));
    }

    @PutMapping("/put")
    public ResponseEntity<Badge> putUser(@RequestBody Badge user) {
        return ResponseEntity.ok(badgeService.update(user));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        badgeService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

}
