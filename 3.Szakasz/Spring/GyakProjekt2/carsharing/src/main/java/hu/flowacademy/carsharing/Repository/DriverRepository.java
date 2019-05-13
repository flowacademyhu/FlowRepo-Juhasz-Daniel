package hu.flowacademy.carsharing.Repository;

import hu.flowacademy.carsharing.Domain.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, String> {

}
