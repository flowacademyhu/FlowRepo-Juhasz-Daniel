package hu.flowacademy.shoppinglist.Controller;

import hu.flowacademy.shoppinglist.Service.ShoppingListService;
import hu.flowacademy.shoppinglist.domain.ShoppingListItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ShoppingListController.class)
public class ShoppingListControllerTests {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ShoppingListService service;

    @Test
    public void givenShoppingListItems_whenShoppingListItems_thenReturnJsonArray() throws Exception {

        ShoppingListItem shoppingListItemShouldBeFound = new ShoppingListItem("12", "asd", "dsa", "333", "error", 100, "wrong", false);

        List<ShoppingListItem> allshoppingListItemShouldBeFound = Arrays.asList(shoppingListItemShouldBeFound);

        given(service.get()).willReturn(allshoppingListItemShouldBeFound);

        mvc.perform(get("/shoppinglist/get")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name", is(shoppingListItemShouldBeFound.getName())));

    }
}
