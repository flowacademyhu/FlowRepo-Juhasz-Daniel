package hu.flowacademy.Badge.serviceTest;

import hu.flowacademy.Badge.domain.Badge;
import hu.flowacademy.Badge.repository.BadgeRepository;
import hu.flowacademy.Badge.service.BadgeService;
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
public class BadgeServiceTest {

    @TestConfiguration
    static class BadgeServiceTestContextConfiguration {

        @Bean
        public BadgeService badgeService() {
            return new BadgeService();
        }
    }

    @Autowired
    private BadgeService badgeService;

    @MockBean
    private BadgeRepository badgeRepository;

   /*@Before
    public void setup() {
        Badge badgeShouldBeFound = new Badge("elso", "NameNém", 01, sa);
        Mockito.when(badgeRepository.findById(todoItemShouldBeFound.getDescription())).thenReturn(badgeShouldBeFound);
    }

    @Test
    public void whenValidDescription_thenTodoItemShouldBeFound() {
        String description = "TestTodoItem";
        TodoItem found = todolistService.getItemByDescription(description);
        assertThat(found.getDescription())
                .isEqualTo(description);
    }
*/
}
