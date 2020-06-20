package dev.dahye.injection.setter;

import dev.dahye.injection.SpringInjectionApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringInjectionApplication.class)
class SetterInjectionTest {
    @Autowired
    private Milk milk;

    @Test
    @DisplayName("세터 주입 테스트 코드")
    void setter_injection() {
        assertThat(milk).isNotNull();
        assertThat(milk.getCereal()).isNotNull();
    }
}