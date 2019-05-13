package hu.flowacademy.carsharing.Domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "car")
public class Car {

    public Car() {
    }

    public Car(String numberPlate, String brand, String type, int year, LocalDate expireDate) {
        this.numberPlate = numberPlate;
        this.brand = brand;
        this.type = type;
        this.year = year;
        this.expireDate = expireDate;
    }

    @Id
    @Column(name = "number_plate")
    private String numberPlate;

    @Column
    private String brand;

    @Column
    private String type;

    @Column
    private int year;

    @Column
    private LocalDate expireDate;

    @OneToMany(mappedBy = "car")
    private List<Reservation> reservationList;

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }
}
