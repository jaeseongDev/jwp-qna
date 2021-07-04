package qna.repository;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.Table;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import qna.domain.User;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository users;

    @Test
    public void saveUser() {
        User user = new User("admin", "admin", "admin", "admin");
        User actual = users.save(user);
        assertThat(actual.getId()).isNotNull();
        assertThat(actual.getName()).isEqualTo("admin");
    }
}
