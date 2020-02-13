package com.blogcode.springguide.order.domain;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ProductItem {

    private Long id;

    private String name;

    private BigDecimal price;

    @Builder
    public ProductItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

}
