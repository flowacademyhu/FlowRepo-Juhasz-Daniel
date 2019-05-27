package hu.flowacademy.bider.Domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Bid {

    public Bid(int licitPrice, String name, LocalDate licitDate, Product product) {
        this.licitPrice = licitPrice;
        this.name = name;
        this.licitDate = licitDate;
        this.product = product;
    }

    public Bid() {
    }

    @Id
    @SequenceGenerator(name = "BidGenerator", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "BidGenerator", strategy = GenerationType.SEQUENCE)
    @Column
    Long id;

    @Column(name = "licit_price")
    int licitPrice;

    @Column
    private String name;

    @Column(name = "licit_date")
    private LocalDate licitDate;

    @ManyToOne
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "fk_product_bid"))
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLicitPrice() {
        return licitPrice;
    }

    public void setLicitPrice(int licitPrice) {
        this.licitPrice = licitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLicitDate() {
        return licitDate;
    }

    public void setLicitDate(LocalDate licitDate) {
        this.licitDate = licitDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
