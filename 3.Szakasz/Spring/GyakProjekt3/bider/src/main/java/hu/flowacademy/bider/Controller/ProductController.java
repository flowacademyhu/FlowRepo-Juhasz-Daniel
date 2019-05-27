package hu.flowacademy.bider.Controller;

import hu.flowacademy.bider.Domain.Product;
import hu.flowacademy.bider.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    private ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/get/{id}")
    private ResponseEntity<Product> getProduct(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProduct(id));
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Void> delete(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/post")
    private  ResponseEntity<Product> post(@RequestBody Product product) {
        return ResponseEntity.ok(productService.post(product));
    }

    @PutMapping("/put")
    private ResponseEntity<Product> put(@RequestBody Product product) {
        return ResponseEntity.ok(productService.put(product));
    }

}
