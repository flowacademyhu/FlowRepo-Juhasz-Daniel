package hu.flowacademy.shoppinglist.Service;

import hu.flowacademy.shoppinglist.domain.ShoppingListItem;
import hu.flowacademy.shoppinglist.repository.ShoppingListRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class ShoppingListServiceTest {

    @TestConfiguration
    static class TodolistServiceTestContextConfiguration {

        @Bean
        public ShoppingListService service() {
            return new ShoppingListService();
        }
    }

    @Autowired
    private ShoppingListService service;

    @MockBean
    private ShoppingListRepo repository;

    @Before
    public void setup() {
        ShoppingListItem shoppingListItemShouldBeFound = new ShoppingListItem("12", "asd", "dsa", "333", "error", 100, "wrong", false);
        Mockito.when(repository.findByUser_UsernameStartingWith(shoppingListItemShouldBeFound.getName())).thenReturn(shoppingListItemShouldBeFound);
    }

    @Test
    public void whenValidDescription_thenTodoItemShouldBeFound() {
        String description = "TestTodoItem";
        TodoItem found = todolistService.getItemByDescription(description);
        assertThat(found.getDescription())
                .isEqualTo(description);
    }


}
