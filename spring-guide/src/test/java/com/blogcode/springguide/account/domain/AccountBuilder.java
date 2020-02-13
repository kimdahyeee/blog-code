package com.blogcode.springguide.account.domain;

public class AccountBuilder {
    public static Account build() {
        final Email email = Email.builder()
                .value("dahye@dahye.com")
                .build();

        return Account.builder()
                .email(email)
                .name("김다혜")
                .build();
    }
}
