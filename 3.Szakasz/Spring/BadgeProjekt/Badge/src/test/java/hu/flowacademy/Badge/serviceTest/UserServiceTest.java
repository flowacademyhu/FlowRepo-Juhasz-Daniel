package hu.flowacademy.Badge.serviceTest;

import hu.flowacademy.Badge.domain.User;
import hu.flowacademy.Badge.repository.UserRepository;
import hu.flowacademy.Badge.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringRunner.class)
public class UserServiceTest {

    @TestConfiguration
    static class UserServiceTestContextConfiguration {

        @Bean
        public UserService userService() {
            return new UserService();
        }
    }

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Before
    public void setup() {
        User userShouldBeFound = new User("Jakab", "Jakab János", "Janipassword", "JaniVagyok");
        Mockito.when(userRepository.findById(userShouldBeFound.getUserName())).thenReturn(Optional.of(userShouldBeFound));
        Mockito.when(userRepository.save(any(User.class))).thenReturn(userShouldBeFound);
        //Mockito.when(userRepository.deleteById(userShouldBeFound.getUserName())).thenReturn(null);
    }

    @Test
    public void findByIdTest() {
        String id = "Jakab";
        Optional<User> founded = userRepository.findById(id);
        assertThat(founded.get().getUserName()).isEqualTo(id);
    }

    @Test
    public void saveUserShouldBeFound_thenReturnUserShouldBeFound() {
        User saveUser = new User("JakabFeradsdasda", "Jakab János", "Janipass", "Janiymkdfok");
        User founded = userRepository.save(saveUser);
        assertThat(founded).isEqualTo(saveUser);
    }

    @Test
    public void deleteUserShouldBeFound_thenReturnNull() {

    }





}
