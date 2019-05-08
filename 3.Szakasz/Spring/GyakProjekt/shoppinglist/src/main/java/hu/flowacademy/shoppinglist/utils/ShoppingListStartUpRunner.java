package hu.flowacademy.shoppinglist.utils;

import hu.flowacademy.shoppinglist.domain.ShoppingListItem;
import hu.flowacademy.shoppinglist.domain.User;
import hu.flowacademy.shoppinglist.repository.ShoppingListRepo;
import hu.flowacademy.shoppinglist.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ShoppingListStartUpRunner implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ShoppingListRepo listRepo;

    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("lalala", "xyz", "Feri Tibi");
        User user2 = new User("xoxoxoxo", "xywz", "Feri Mari");

        ShoppingListItem list1 = new ShoppingListItem("a1", "list1", "jó", "jobb", "ennyi", 200, "hello", user1);
        ShoppingListItem list2 = new ShoppingListItem("a2", "list2", "rossz", "jobb", "ennyi", 100, "jóvolt", user2);
        ShoppingListItem list3 = new ShoppingListItem("a3", "list3", "jó", "jobb", "ennyi", 50, "drága", user2);
        ShoppingListItem list4 = new ShoppingListItem("a4", "list4", "jó", "jobb", "ennyi", 20, "hello", user1);

        userRepo.save(user1);
        userRepo.save(user2);

        listRepo.save(list1);
        listRepo.save(list2);
        listRepo.save(list3);
        listRepo.save(list4);
    }
}

