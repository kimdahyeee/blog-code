package dev.dahye.injection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Milk {
    private Cereal cereal;

    @Autowired
    public void setCereal(Cereal cereal) {
        this.cereal = cereal;
    }

    public Cereal getCereal() {
        return cereal;
    }
}
