package hu.flowacademy.carsharing.Repository;

import hu.flowacademy.carsharing.Domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {

    public void deleteById(String numberPlate);

    public List<Car> findByExpireDateAfter(LocalDate expireDate);

    public List<Car> findByBrand(String brand);

}
