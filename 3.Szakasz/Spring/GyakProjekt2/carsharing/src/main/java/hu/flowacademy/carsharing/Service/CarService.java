package hu.flowacademy.carsharing.Service;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Exception.CarNotFoundException;
import hu.flowacademy.carsharing.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Car findByNumberPlate(String numberPlate){
        if (carRepository.findById(numberPlate).isPresent()) {
            return carRepository.findById(numberPlate).get();
        }
        throw new CarNotFoundException(numberPlate);
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public void deleteCar(String numberPlate) {
        if (carRepository.findById(numberPlate).isPresent()){
            carRepository.deleteById(numberPlate);
        } else {
            throw new CarNotFoundException(numberPlate);
        }
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

}
