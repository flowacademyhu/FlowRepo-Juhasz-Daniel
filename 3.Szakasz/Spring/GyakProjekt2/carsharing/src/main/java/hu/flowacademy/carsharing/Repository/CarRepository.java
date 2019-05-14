package hu.flowacademy.carsharing.Repository;

import hu.flowacademy.carsharing.Domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {

    public void deleteById(String numberPlate);

}
