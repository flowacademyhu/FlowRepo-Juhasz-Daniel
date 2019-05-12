package hu.flowacademy.shoppinglist.Controller;

import hu.flowacademy.shoppinglist.Service.VariantService;
import hu.flowacademy.shoppinglist.domain.Variant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/variant")
public class VariantController {

    @Autowired
    private VariantService service;

    @GetMapping("/get/{id}")
    public ResponseEntity<List<Variant>> getVariants(@PathVariable long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    /*@PostMapping("/add")
    public ResponseEntity<Variant> addVariant(@RequestBody Variant variant) {
        return ResponseEntity.ok(service.save(variant));
    }

    @PutMapping("/update")
    public ResponseEntity<Variant> updateVariant(@RequestBody Variant variant) {
        return ResponseEntity.ok(service.save(variant));
    }*/



}
