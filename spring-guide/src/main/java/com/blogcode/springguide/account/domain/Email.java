package com.blogcode.springguide.account.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Email {
    private String value;

    @Builder
    private Email(String value) {
        this.value = value;
    }

    public static Email of(String email) {
        return Email.builder().value(email).build();
    }

    public String getId() {
        int index = value.indexOf("@");
        return this.value.substring(0, index);
    }

    public String getHost() {
        int index = value.indexOf("@");
        return this.value.substring(index);
    }
}
