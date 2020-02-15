package com.blogcode.springguide.coupon.domain;

import com.blogcode.springguide.account.domain.Account;
import com.blogcode.springguide.coupon.exception.CouponAlreadyUsedException;
import com.blogcode.springguide.coupon.exception.CouponExpireException;
import lombok.Builder;

import java.time.LocalDateTime;

public class Coupon {
    private CouponCode couponCode;
    private boolean used;
    private double discount;
    private LocalDateTime expirationDate;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    private Account account;

    @Builder
    public Coupon(CouponCode couponCode, double discount, LocalDateTime expirationDate, Account account) {
        this.couponCode = couponCode;
        this.discount = discount;
        this.expirationDate = expirationDate;
        this.account = account;
        this.used = false;
    }

    public boolean isExpiration() {
        return LocalDateTime.now().isAfter(expirationDate);
    }

    public void use() {
        verifyExpiration();
        verifyUsed();
        this.used = true;
    }

    private void verifyExpiration() {
        if(used) throw new CouponExpireException();
    }

    private void verifyUsed() {
        if(isExpiration()) throw new CouponAlreadyUsedException();
    }

}
