package dev.dahye.injection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Juice {
    @Autowired
    private Orange orange;

    public Orange getOrange() {
        return orange;
    }
}
