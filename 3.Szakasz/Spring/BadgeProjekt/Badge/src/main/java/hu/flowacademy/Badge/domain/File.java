package hu.flowacademy.Badge.domain;

import javax.persistence.*;

@Entity
@Table(name = "file")
public class File {

    @Id
    @Column(name = "file_id")
    private String id;

    @ManyToOne
    @JoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_file_badge"))
    private Badge badge;

    private byte[] content;

    @Column
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Badge getBadge() {
        return badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
