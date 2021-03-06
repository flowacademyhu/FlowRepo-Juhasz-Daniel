package hu.flowacademy.carsharing.Controller;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Domain.Driver;
import hu.flowacademy.carsharing.Service.CarService;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.image.ReplicateScaleFilter;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/get/{numberPlate}")
    public ResponseEntity<Car> findOneCar(@PathVariable String numberPlate) {
        return ResponseEntity.ok(carService.findByNumberPlate(numberPlate));
    }

    @GetMapping("/get")
    public ResponseEntity<List<Car>> findAll() {
        return ResponseEntity.ok(carService.findAll());
    }

    @PutMapping("/update")
    public ResponseEntity<Car> update(@RequestBody Car car) {
        return ResponseEntity.ok(carService.save(car));
    }

    @PostMapping("/post")
    public ResponseEntity<Car> post(@RequestBody Car car) {
        return ResponseEntity.ok(carService.save(car));
    }

    @DeleteMapping("/delete/{numberPlate}")
    public ResponseEntity<Void> deleteCar(@PathVariable String numberPlate) {
        carService.deleteCar(numberPlate);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getByExpireDate")
    public ResponseEntity<List<Car>> getByExpireDate(){
        return ResponseEntity.ok(carService.getByExpireDate());
    }

    @GetMapping("/getByBrand/{brand}")
    public ResponseEntity<List<Car>> getByBrand(@PathVariable String brand) {
        return ResponseEntity.ok(carService.getByBrand(brand));
    }
}
