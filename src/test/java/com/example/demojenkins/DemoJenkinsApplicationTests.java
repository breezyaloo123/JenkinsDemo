package com.example.demojenkins;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJenkinsApplicationTests {



    @Test
    void oneplusone() {
        int somme  = 1 + 1;
        Assertions.assertThat(somme).isEqualTo(2);
    }

    @Test
    void oneplustwo() {
        int somme  = 1 + 2;
        Assertions.assertThat(somme).isEqualTo(3);
    }

}
