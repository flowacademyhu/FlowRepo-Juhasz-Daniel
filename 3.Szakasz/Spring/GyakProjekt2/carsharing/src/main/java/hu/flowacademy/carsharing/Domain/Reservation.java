package hu.flowacademy.carsharing.Domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservation")
public class Reservation {

    public Reservation() {
    }

    public Reservation(String reserveId, LocalDate reserveDate, LocalDate reserveStart, LocalDate reserveEnding, String destination, Car car, Driver driver) {
        this.reserveId = reserveId;
        this.reserveDate = reserveDate;
        this.reserveStart = reserveStart;
        this.reserveEnding = reserveEnding;
        this.destination = destination;
        this.car = car;
        this.driver = driver;
    }

    @Id
    @Column(name = "reserve_id")
    private String reserveId;

    @Column(name = "reserve_date")
    private LocalDate reserveDate;

    @Column(name = "reserve_start")
    private LocalDate reserveStart;

    @Column(name = "reserve_ending")
    private  LocalDate reserveEnding;

    @Column
    private String destination;

    @ManyToOne
    @JoinColumn(name = "car_number_plate", foreignKey = @ForeignKey(name = "fk_car_reservation"))
    private Car car;

    @ManyToOne
    @JoinColumn(name = "driver_login_name", foreignKey = @ForeignKey(name = "fk_driver_reservation"))
    private Driver driver;

    public String getReserveId() {
        return reserveId;
    }

    public void setReserveId(String reserveId) {
        this.reserveId = reserveId;
    }

    public LocalDate getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(LocalDate reserveDate) {
        this.reserveDate = reserveDate;
    }

    public LocalDate getReserveStart() {
        return reserveStart;
    }

    public void setReserveStart(LocalDate reserveStart) {
        this.reserveStart = reserveStart;
    }

    public LocalDate getReserveEnding() {
        return reserveEnding;
    }

    public void setReserveEnding(LocalDate reserveEnding) {
        this.reserveEnding = reserveEnding;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}