package hu.flowacademy.carsharing.Services;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Repository.CarRepository;
import hu.flowacademy.carsharing.Service.CarService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class CarServiceTest {

    @TestConfiguration
    static class CarServiceTestContextConfiguration {

        @Bean
        public CarService employeeService() {
            return new CarService();
        }
    }

    @Autowired
    private CarService carService;

    @MockBean
    private CarRepository carRepository;

   /* @Before
    public void setup() {
        Car carShouldBeFound = new Car("NAM-111", "Toyota", "SX", 2010, LocalDate.of(2030, Month.APRIL, 02));

        Mockito.when(carRepository.findByBrand(carShouldBeFound.getBrand())).thenReturn(carShouldBeFound);
    }

    @Test
    public void whenValidDescription_thenTodoItemShouldBeFound() {
        String description = "TestTodoItem";
        TodoItem found = todolistService.getItemByDescription(description);
        assertThat(found.getDescription())
                .isEqualTo(description);
    }*/

}
