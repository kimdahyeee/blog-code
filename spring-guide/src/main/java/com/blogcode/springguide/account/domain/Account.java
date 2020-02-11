package com.blogcode.springguide.account.domain;

import com.blogcode.springguide.account.dto.MyAccountDto;
import com.blogcode.springguide.domain.Address;
import lombok.Builder;

import java.time.LocalDateTime;

public class Account {
    private Long id;
    private Email email;
    private Password password;
    private String name;
    private Address address;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @Builder
    private Account(Email email, Password password, String name, Address address) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
    }

    public void updateMyAccount(MyAccountDto.MyAccountReq req) {
        this.address = req.getAddress();
    }
}
