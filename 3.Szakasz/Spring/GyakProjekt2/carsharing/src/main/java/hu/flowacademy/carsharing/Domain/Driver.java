package hu.flowacademy.carsharing.Domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "driver")
public class Driver {

    public Driver() {
    }

    public Driver(String loginName, String password, String fullName, LocalDate expireDate, boolean active) {
        this.loginName = loginName;
        this.password = password;
        this.fullName = fullName;
        this.expireDate = expireDate;
        this.active = active;
    }

    @Id
    @Column(name = "login_name")
    private String loginName;

    @Column
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Column
    private LocalDate expireDate;

    @Column
    private boolean active;

    @OneToMany(mappedBy = "driver")
    private List<Reservation> reservationListDrivers;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
