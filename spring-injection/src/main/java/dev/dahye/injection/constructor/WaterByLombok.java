package dev.dahye.injection.constructor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WaterByLombok {
    private final TeaBag greenTea;

    public TeaBag getTeaBag() {
        return greenTea;
    }
}
