package com.blogcode.springguide.account.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("myAccountDto 테스트")
class MyAccountDtoTest {

    @Test
    @DisplayName("SignUpReq 생성 시 assert 에러 확인")
    public void assertion_test() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MyAccountDto.SignUpReq signUpReq = MyAccountDto.SignUpReq.builder().build();
        });

        assertEquals("email must not be null", exception.getMessage());
    }
}