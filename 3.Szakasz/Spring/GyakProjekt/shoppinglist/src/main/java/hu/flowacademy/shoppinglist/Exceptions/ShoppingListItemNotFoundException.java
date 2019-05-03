package hu.flowacademy.shoppinglist.Exceptions;

public class ShoppingListItemNotFoundException extends RuntimeException {

    public ShoppingListItemNotFoundException(String id) {
        super ("Could not find shopping list item" + id);
    }

}
