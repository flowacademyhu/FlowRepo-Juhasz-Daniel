package hu.flowacademy.Badge.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    public User(String userName, String fullName, String password, String role) {
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
        this.role = role;
    }

    public User() {
    }

    @Id
    @Column(name = "user_name")
    private String userName;

    @Column(name = "full_name")
    private String fullName;

    @Column
    private  String password;

    @Column
    private String role;

    @Transient
    @OneToMany(mappedBy = "owner")
    private List<Badge> badges;

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userName, user.userName) &&
                Objects.equals(fullName, user.fullName) &&
                Objects.equals(password, user.password) &&
                Objects.equals(role, user.role) &&
                Objects.equals(badges, user.badges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, fullName, password, role, badges);
    }
}
