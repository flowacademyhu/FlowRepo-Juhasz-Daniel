package hu.flowacademy.shoppinglist.domain;

import javax.persistence.*;

@Entity
@Table(name = "variant")
public class Variant {

    public Variant(long id, String name, int price, ShoppingListItem shoppingListItem, String shoppingListItemId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.shoppingListItem = shoppingListItem;
        this.shoppingListItemId = shoppingListItemId;
    }

    @Id
    @SequenceGenerator(name="variantGenerator", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "variantGenerator", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;

    @Column
    private String name;

    @Column
    private int price;

    @ManyToOne
    @JoinColumn(name = "shoppingList_item_id", foreignKey = @ForeignKey(name = "fk_shoppingListItem_Variant"))
    private ShoppingListItem shoppingListItem;

    @Transient
    private String shoppingListItemId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ShoppingListItem getShoppingListItem() {
        return shoppingListItem;
    }

    public void setShoppingListItem(ShoppingListItem shoppingListItem) {
        this.shoppingListItem = shoppingListItem;
    }

    public String getShoppingListItemId() {
        return shoppingListItemId;
    }

    public void setShoppingListItemId(String shoppingListItemId) {
        this.shoppingListItemId = shoppingListItemId;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
