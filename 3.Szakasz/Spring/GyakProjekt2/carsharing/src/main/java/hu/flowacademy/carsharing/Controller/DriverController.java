package hu.flowacademy.carsharing.Controller;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Domain.Driver;
import hu.flowacademy.carsharing.Repository.DriverRepository;
import hu.flowacademy.carsharing.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping("/get/{loginName}")
    public ResponseEntity<Driver> findOneDriver(@PathVariable String loginName) {
        return ResponseEntity.ok(driverService.findByLoginName(loginName));
    }

    @GetMapping("/get")
    public ResponseEntity<List<Driver>> findAll() {
        return ResponseEntity.ok(driverService.findAll());
    }

    @PutMapping("/update")
    public ResponseEntity<Driver> update(Driver driver) {
        return ResponseEntity.ok(driverService.save(driver));
    }

    @PostMapping("/post")
    public ResponseEntity<Driver> post(Driver driver) {
        return ResponseEntity.ok(driverService.save(driver));
    }

    @DeleteMapping("/delete/{loginName}")
    public ResponseEntity<Void> deleteDriver(@PathVariable String loginName) {
        driverService.deleteDriver(loginName);
        return ResponseEntity.noContent().build();
    }
}
