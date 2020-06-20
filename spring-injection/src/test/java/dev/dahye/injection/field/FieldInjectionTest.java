package dev.dahye.injection.field;

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
class FieldInjectionTest {
    @Autowired
    private Juice juice;

    @Test
    @DisplayName("필드 주입 테스트 코드")
    void field_injection() {
        assertThat(juice).isNotNull();
        assertThat(juice.getOrange()).isNotNull();
    }
}