package hu.flowacademy.Badge.controllerTest;

import hu.flowacademy.Badge.controller.UserController;
import hu.flowacademy.Badge.domain.User;
import hu.flowacademy.Badge.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
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
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private UserService userService;

    @Test
    public void givenTodoItems_whenTodoItems_thenReturnJsonArray() throws Exception {

        User userShouldBeFound = new User("Jakab", "Jakab János", "Janipassword", "JaniVagyok");

        List<User> allUserShouldBeFound = Arrays.asList(userShouldBeFound);

        given(userService.getAll()).willReturn(allUserShouldBeFound);

        mvc.perform(get("/user/getAll")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].role", is(userShouldBeFound.getRole())));
    }

}
