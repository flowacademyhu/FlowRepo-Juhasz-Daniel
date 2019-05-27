package hu.flowacademy.bider.Domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    public Product(String name, String description, int price, LocalDate productAdded, LocalDate licitLimitDate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.productAdded = productAdded;
        this.licitLimitDate = licitLimitDate;
    }

    public Product() {
    }

    @Id
    @SequenceGenerator(name = "ProductGenerator", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "ProductGenerator", strategy = GenerationType.SEQUENCE)
    @Column
    Long id;

    @Column
    String name;

    @Column
    String description;

    @Column
    int price;

    @Column(name = "product_added")
    LocalDate productAdded;

    @Column(name = "licit_limit_date")
    LocalDate licitLimitDate;

    @OneToMany(mappedBy = "product")
    private List<Bid> bids;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getProductAdded() {
        return productAdded;
    }

    public void setProductAdded(LocalDate productAdded) {
        this.productAdded = productAdded;
    }

    public LocalDate getLicitLimitDate() {
        return licitLimitDate;
    }

    public void setLicitLimitDate(LocalDate licitLimitDate) {
        this.licitLimitDate = licitLimitDate;
    }
}
