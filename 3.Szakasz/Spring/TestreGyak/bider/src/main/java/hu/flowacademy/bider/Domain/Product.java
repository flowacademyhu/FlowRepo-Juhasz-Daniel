package hu.flowacademy.bider.Domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    public Product(String name, String description, int minimumPrice, LocalDate productAdded, LocalDate licitLimitDate) {
        this.name = name;
        this.description = description;
        this.minimumPrice = minimumPrice;
        this.productAdded = productAdded;
        this.licitLimitDate = licitLimitDate;
    }

    public Product() {
    }

    @Id
    @SequenceGenerator(name = "idGenerator", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "idGenerator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column(name = "minimum_price")
    private int minimumPrice;

    @Column(name = "product_added")
    private LocalDate productAdded;

    @Column(name = "licit_limit_date")
    private LocalDate licitLimitDate;

    @OneToMany(mappedBy = "product")
    private List<Bid> bidList;

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

    public int getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(int minimumPrice) {
        this.minimumPrice = minimumPrice;
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
