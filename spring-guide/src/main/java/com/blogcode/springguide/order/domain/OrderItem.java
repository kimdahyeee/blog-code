package com.blogcode.springguide.order.domain;

import java.math.BigDecimal;

public class OrderItem {

    private Long id;

    private String name;

    private BigDecimal price;

    public OrderItem(ProductItem productItem) {
        this.name = productItem.getName();
        this.price = productItem.getPrice();
    }
}
