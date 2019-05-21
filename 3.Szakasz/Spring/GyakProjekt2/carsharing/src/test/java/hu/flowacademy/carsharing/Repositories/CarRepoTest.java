package hu.flowacademy.carsharing.Repositories;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Repository.CarRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CarRepoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CarRepository carRepository;

    /*@Test
    public void whenDeleteById() {

        Car carShouldBeDeleted = new Car("111", "Test", "SX", 2010, LocalDate.of(2030, Month.APRIL, 02));

        entityManager.persist(carShouldBeDeleted);
        entityManager.flush();





    }*/

    @Test
    public void whenFindByBrand() {

        Car carShouldBeFoundByBrand = new Car("111", "Test", "SX", 2010, LocalDate.of(2030, Month.APRIL, 02));

        entityManager.persist(carShouldBeFoundByBrand);
        entityManager.flush();

        List<Car> carFoundByBrand = carRepository.findByBrand(carShouldBeFoundByBrand.getBrand());
        assertThat(carFoundByBrand.get(0).getBrand()).isEqualTo(carShouldBeFoundByBrand.getBrand());
    }

    @Test
    public void whenFindByExpireDate() {

        Car carShouldBeFoundByExpireDate = new Car("111", "Test", "SX", 2010, LocalDate.of(2030, Month.APRIL, 02));

        entityManager.persist(carShouldBeFoundByExpireDate);
        entityManager.flush();

        List<Car> carFoundByExpireDate = carRepository.findByBrand(carShouldBeFoundByExpireDate.getBrand());
        assertThat(carFoundByExpireDate.get(0).getBrand()).isEqualTo(carShouldBeFoundByExpireDate.getBrand());
    }
}
