package hu.flowacademy.carsharing.Controller;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Car> update(Car car) {
        return ResponseEntity.ok(carService.save(car));
    }

    @PostMapping("/post")
    public ResponseEntity<Car> post(Car car) {
        return ResponseEntity.ok(carService.save(car));
    }

    @DeleteMapping("/delete/{numberPlate}")
    public ResponseEntity<Void> deleteCar(@PathVariable String numberPlate) {
        carService.deleteCar(numberPlate);
        return ResponseEntity.noContent().build();
    }
}
