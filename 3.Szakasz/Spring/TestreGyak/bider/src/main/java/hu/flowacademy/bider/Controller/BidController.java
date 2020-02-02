package hu.flowacademy.bider.Controller;

import hu.flowacademy.bider.Domain.Bid;
import hu.flowacademy.bider.Domain.Product;
import hu.flowacademy.bider.Service.BidService;
import hu.flowacademy.bider.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/bid")
public class BidController {

    @Autowired
    private BidService bidService;

    @GetMapping("/findAll")
    private ResponseEntity<List<Bid>> findAll(){
        return ResponseEntity.ok(bidService.findAll());
    }

    @GetMapping("/findById/{id}")
    private ResponseEntity<Bid> findById(@PathVariable Long id){
        return ResponseEntity.ok(bidService.findById(id));
    }

    @PutMapping("/put")
    private ResponseEntity<Bid> put(@RequestBody Bid bid) {
        return ResponseEntity.ok(bidService.save(bid));
    }

    @PostMapping("/post")
    private ResponseEntity<Bid> post(@RequestBody Bid bid) {
        return ResponseEntity.ok(bidService.save(bid));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> delete(@PathVariable Long id) {
        bidService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
