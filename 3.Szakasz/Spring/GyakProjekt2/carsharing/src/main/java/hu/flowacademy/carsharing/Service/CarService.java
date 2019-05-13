package hu.flowacademy.carsharing.Service;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Domain.Reservation;
import hu.flowacademy.carsharing.Exception.CarNotFoundException;
import hu.flowacademy.carsharing.Repository.CarRepository;
import hu.flowacademy.carsharing.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
