package com.blogcode.springguide.domain;

import lombok.Builder;
import org.springframework.util.Assert;

public class CreditCard {
    private String creditNumber;
    private String creditHolder;

    @Builder
    public CreditCard(String creditNumber, String creditHolder) {
        Assert.notNull(creditNumber, "creditNumber must not be null");
        Assert.notNull(creditHolder, "creditHolder must not be null");

        this.creditNumber = creditNumber;
        this.creditHolder = creditHolder;
    }
}
