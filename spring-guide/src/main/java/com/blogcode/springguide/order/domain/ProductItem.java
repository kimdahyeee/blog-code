package com.blogcode.springguide.order.domain;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ProductItem {

    private Long id;

    private String name;

    private BigDecimal price;

}
