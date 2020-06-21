package dev.dahye.injection.constructor;

import org.springframework.stereotype.Component;

@Component
public class Water {
    private final TeaBag teaBag;

    public Water(TeaBag chamomile) {
        this.teaBag = chamomile;
    }

    public TeaBag getTeaBag() {
        return teaBag;
    }
}
