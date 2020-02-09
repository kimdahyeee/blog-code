package com.blogcode.springguide.domain;

import lombok.Builder;

public class Address {

    private String county;

    private String state;

    private String city;

    private String zipCode;

    @Builder
    public Address(final String county, final String state, final String city, final String zipCode) {
        this.county = county;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return String.format("%s %s %s", this.state, this.city, this.zipCode);
    }

}
