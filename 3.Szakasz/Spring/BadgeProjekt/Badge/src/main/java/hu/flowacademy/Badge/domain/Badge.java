package hu.flowacademy.Badge.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "badge")
public class Badge {

    public Badge(String id, String name, User owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public Badge() {
    }

    @Id
    @Column
    private String id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_name", foreignKey = @ForeignKey(name = "fk_user_badge"))
    private User owner;

    @Transient
    @OneToMany(mappedBy = "badge")
    private List<File> contentList;

    @ManyToMany
    @JoinTable(
            name = "join_table_example",
            joinColumns = @JoinColumn(name = "badge_id"),
            inverseJoinColumns = @JoinColumn(name = "user_userName"))
    private Set<User> manyUsers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Set<User> getManyUsers() {
        return manyUsers;
    }

    public void setManyUsers(Set<User> manyUsers) {
        this.manyUsers = manyUsers;
    }
}
