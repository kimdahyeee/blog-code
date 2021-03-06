package com.blogcode.springguide.account.dto;

import com.blogcode.springguide.account.domain.Account;
import com.blogcode.springguide.account.domain.Email;
import com.blogcode.springguide.account.domain.Password;
import com.blogcode.springguide.domain.Address;
import lombok.*;
import org.springframework.util.Assert;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MyAccountDto {

    public static class SignUpReq {
        private Email email;
        private String name;
        private String password;
        private Address address;

        @Builder
        public SignUpReq(Email email, String name, String password, Address address) {
            Assert.notNull(email, "email must not be null");
            Assert.notNull(name, "name must not be null");
            Assert.notNull(password, "password must not be null");
            Assert.notNull(address, "address must not be null");

            this.email = email;
            this.name = name;
            this.password = password;
            this.address = address;
        }

        public Account toEntity() {
            return Account.builder()
                    .email(this.email)
                    .name(this.name)
                    .password(Password.builder().value(this.password).build())
                    .address(this.address)
                    .build();
        }
    }

    @Getter
    @NoArgsConstructor
    public static class MyAccountReq {
        private Address address;

        @Builder
        public MyAccountReq(final Address address) {
            this.address = address;
        }
    }

}
