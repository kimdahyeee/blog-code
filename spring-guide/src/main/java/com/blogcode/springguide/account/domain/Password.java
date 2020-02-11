package com.blogcode.springguide.account.domain;

import lombok.Builder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;

public class Password {
    private String value;
    private LocalDateTime expireDate;
    private int failCount;

    @Builder
    private Password(String value) {
        this.value = encodedPassword(value);
        this.expireDate = getExpireDate();
    }

    private String encodedPassword(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }

    private LocalDateTime getExpireDate() {
        return LocalDateTime.now().plusDays(90);
    }
}
