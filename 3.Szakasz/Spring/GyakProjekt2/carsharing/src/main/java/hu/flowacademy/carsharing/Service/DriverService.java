package hu.flowacademy.carsharing.Service;

import hu.flowacademy.carsharing.Domain.Driver;
import hu.flowacademy.carsharing.Exception.DriverNotFoundExpection;
import hu.flowacademy.carsharing.Repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public Driver findByLoginName(String loginName){
        if (driverRepository.findById(loginName).isPresent()) {
            return driverRepository.findById(loginName).get();
        }
        throw new DriverNotFoundExpection(loginName);
    }

    public List<Driver> findAll() {
        return driverRepository.findAll();
    }

    public void deleteDriver(String loginName) {
        if(driverRepository.findById(loginName).isPresent()) {
            driverRepository.deleteById(loginName);
        } else {
            throw new DriverNotFoundExpection(loginName);
        }
    }

    public Driver save(Driver driver) {
        return driverRepository.save(driver);
    }

}
