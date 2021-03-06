package hu.flowacademy.carsharing.Service;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Exception.CannotDeleteException;
import hu.flowacademy.carsharing.Exception.CarNotFoundException;
import hu.flowacademy.carsharing.Repository.CarRepository;
import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Iterator;
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
        try {
            if (carRepository.findById(numberPlate).isPresent()){
                carRepository.deleteById(numberPlate);
            } else {
                throw new CarNotFoundException(numberPlate);
            }
        }catch (Exception e){
            throw new CannotDeleteException("car can not be deleted");
        }
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getByExpireDate() {
        return carRepository.findByExpireDateAfter(LocalDate.now());
    }

    public List<Car> getByBrand(String brand) {
        return carRepository.findByBrand(brand);
    }

}
