package hu.flowacademy.bider.Domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bid")
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
    @SequenceGenerator(name = "idGeneratorBid", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "idGeneratorBid", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "licit_price")
    private int licitPrice;

    @Column
    private String name;

    @Column
    private LocalDate licitDate;

    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "fk_product_bid"))
    @ManyToOne
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

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
}
