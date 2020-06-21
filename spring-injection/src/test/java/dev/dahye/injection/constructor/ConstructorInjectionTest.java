package dev.dahye.injection.constructor;

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
class ConstructorInjectionTest {
    @Autowired
    private Water water;

    @Test
    @DisplayName("생성자 주입 테스트 코드")
    void constructor_injection() {
        assertThat(water).isNotNull();
        assertThat(water.getTeaBag()).isNotNull();
        assertThat(water.getTeaBag()).isInstanceOf(Chamomile.class);
    }

    @Test
    @DisplayName("생성자 주입 사용 시, 스프링 컨테이너에 의존하지 않고 테스트할 수 있다.")
    void constructor_injection_without_dependence() {
        Water water = new Water(new GreenTea());
        assertThat(water).isNotNull();
        assertThat(water.getTeaBag()).isNotNull();
        assertThat(water.getTeaBag()).isInstanceOf(GreenTea.class);
    }
}