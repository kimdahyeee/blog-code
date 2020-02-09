package com.blogcode.springguide.order.domain;

import com.blogcode.springguide.domain.Address;
import lombok.Getter;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {

    private Long id;

    private Address address;

    private Orderer orderer;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(Address address, Orderer orderer, List<ProductItem> productItems) {
        Assert.notNull(address, "address must not be null");
        Assert.notNull(orderer, "orderer must not be null");
        Assert.notEmpty(orderItems, "orderItems must not be empty");

        this.address = address;
        this.orderer = orderer;
        for(ProductItem productItem : productItems) {
            orderItems.add(new OrderItem(productItem));
        }
    }
}
