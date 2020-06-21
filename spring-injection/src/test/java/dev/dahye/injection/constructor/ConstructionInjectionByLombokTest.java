package dev.dahye.injection.constructor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConstructionInjectionByLombokTest {
    @Test
    @DisplayName("롬복의 @RequiredArgsConstructor를 활용한 생성자 주입")
    void constructor_injection_without_dependence() {
        WaterByLombok water = new WaterByLombok(new GreenTea());
        assertThat(water).isNotNull();
        assertThat(water.getTeaBag()).isNotNull();
        assertThat(water.getTeaBag()).isInstanceOf(GreenTea.class);
    }
}
