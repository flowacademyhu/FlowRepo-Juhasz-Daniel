package hu.flowacademy.shoppinglist.domain;


import javax.persistence.*;

@Entity
@Table(name = "shopping_list_item")
public class ShoppingListItem {

    public ShoppingListItem(String id, String name, String category, String quantity, String quantityunit, int price, String comment, User user) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.quantityunit = quantityunit;
        this.price = price;
        this.comment = comment;
        this.user = user;
    }

    public ShoppingListItem() {
    }

    @Id
    @Column
    private String id;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private String quantity;

    @Column(name = "quantity_unit")
    private String quantityunit;

    @Column
    private int price;

    @Column
    private String comment;

    @OneToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_shoppinglistitem_userid"))
    private User user;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantityunit() {
        return quantityunit;
    }

    public void setQuantityunit(String quantityunit) {
        this.quantityunit = quantityunit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ShoppingListItem{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", quantity='" + quantity + '\'' +
                ", quantityunit='" + quantityunit + '\'' +
                ", price='" + price + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
