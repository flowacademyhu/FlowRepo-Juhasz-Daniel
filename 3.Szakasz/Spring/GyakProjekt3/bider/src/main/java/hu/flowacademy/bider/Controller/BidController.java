package hu.flowacademy.bider.Controller;

import hu.flowacademy.bider.Domain.Bid;
import hu.flowacademy.bider.Service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/bid")
public class BidController {

    @Autowired
    private BidService bidService;

    @GetMapping("/getAll")
    private ResponseEntity<List<Bid>> getAll() {
        return ResponseEntity.ok(bidService.getAll());
    }

    @GetMapping("/get/{id}")
    private ResponseEntity<Bid> getProduct(@PathVariable Long id) {
        return ResponseEntity.ok(bidService.getProduct(id));
    }

    @GetMapping("/getInOrder/{id}")
    private ResponseEntity<List<Bid>> getInOrder(@PathVariable Long id) {
        return ResponseEntity.ok(bidService.getInOrder(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> delete(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/post/{id}")
    private  ResponseEntity<Bid> post(@PathVariable Long id, @RequestBody Bid bid) {
        return ResponseEntity.ok(bidService.put(id, bid));
    }

    @PutMapping("/put/{id}")
    private ResponseEntity<Bid> put(@PathVariable Long id, @RequestBody Bid bid) {
        return ResponseEntity.ok(bidService.put(id, bid));
    }

}
