package hu.flowacademy.Badge.domain;

import javax.persistence.*;

@Entity
@Table(name = "badge")
public class Badge {

    public Badge(String id, String name, byte[] content, User owner) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.owner = owner;
    }

    public Badge() {
    }

    @Id
    @Column
    private String id;

    @Column
    private String name;

    @Column
    private byte[] content;

    @ManyToOne
    @JoinColumn(name = "user_username", foreignKey = @ForeignKey(name = "fk_user_badge"))
    private User owner;

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

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
