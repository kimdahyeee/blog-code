package com.blogcode.springguide.order.domain;

import com.blogcode.springguide.domain.Address;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderBuilder {

    public static Order build() {
        final Address address = Address.builder()
                .county("대한민국")
                .state("경기도")
                .city("용인시")
                .zipCode("12312")
                .build();

        final Orderer orderer = Orderer.nonMemberOrderer("김다혜");

        final List<ProductItem> productItems = new ArrayList<>();
        final ProductItem productItem = ProductItem.builder().name("상품").price(BigDecimal.valueOf(10000)).build();
        productItems.add(productItem);

        return Order.builder()
                .address(address)
                .orderer(orderer)
                .productItems(productItems)
                .build();
    }
}