package hu.flowacademy.carsharing.Util;

import hu.flowacademy.carsharing.Domain.Car;
import hu.flowacademy.carsharing.Domain.Driver;
import hu.flowacademy.carsharing.Domain.Reservation;
import hu.flowacademy.carsharing.Repository.CarRepository;
import hu.flowacademy.carsharing.Repository.DriverRepository;
import hu.flowacademy.carsharing.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;

@Component
public class StartUpRunning implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public void run(String... args) throws Exception {

        Car car1 = new Car("NAM-234", "Toyota", "SX", 2010, LocalDate.of(2030, Month.APRIL, 02));
        Car car2 = new Car("NAM-233", "VW", "Passat", 2010, LocalDate.of(2025, Month.APRIL, 20));

        Driver driver1 = new Driver("Feri", "12345", "Szabó Ferenc", LocalDate.of(2040, Month.FEBRUARY, 28), true);
        Driver driver2 = new Driver("Tibi", "12saddaaa345", "Szabó Tibor", LocalDate.of(2040, Month.FEBRUARY, 28), true);
        Driver driver3 = new Driver("Mari", "12aaaa345", "Szabó Mária", LocalDate.of(2040, Month.FEBRUARY, 28), true);

        Reservation reservation1 = new Reservation("1", LocalDate.of(2025, Month.FEBRUARY, 20), LocalDate.of(2025, Month.FEBRUARY, 28), LocalDate.of(2025, Month.MARCH, 10), "Dorozsma", car1, driver1);
        Reservation reservation2 = new Reservation("2", LocalDate.of(2025, Month.FEBRUARY, 22), LocalDate.of(2025, Month.MARCH, 10), LocalDate.of(2025, Month.MARCH, 15), "Budapest", car2, driver3);
        Reservation reservation3 = new Reservation("3", LocalDate.of(2025, Month.JANUARY, 10), LocalDate.of(2025, Month.JANUARY, 12), LocalDate.of(2025, Month.JANUARY, 20), "Szeged", car2, driver1);
        Reservation reservation4 = new Reservation("4", LocalDate.of(2025, Month.MARCH, 15), LocalDate.of(2025, Month.MARCH, 17), LocalDate.of(2025, Month.MARCH, 20), "Balástya", car1, driver2);

        carRepository.save(car1);
        carRepository.save(car2);

        driverRepository.save(driver1);
        driverRepository.save(driver2);
        driverRepository.save(driver3);

        reservationRepository.save(reservation1);
        reservationRepository.save(reservation2);
        reservationRepository.save(reservation3);
        reservationRepository.save(reservation4);

    }
}
