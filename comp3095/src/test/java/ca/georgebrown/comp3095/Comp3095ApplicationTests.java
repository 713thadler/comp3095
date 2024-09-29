package ca.georgebrown.comp3095;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class Comp3095ApplicationTests {

    @Test
    void contextLoads() {
    }

}
