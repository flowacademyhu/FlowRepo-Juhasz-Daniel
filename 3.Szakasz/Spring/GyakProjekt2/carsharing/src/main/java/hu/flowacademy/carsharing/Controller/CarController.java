package hu.flowacademy.carsharing.Controller;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/get/{numberPlate}")
    public ResponseEntity<Car> findOneCar(@PathVariable String numberPlate) {
        return ResponseEntity.ok(carService.findByNumberPlate(numberPlate));
    }

}
