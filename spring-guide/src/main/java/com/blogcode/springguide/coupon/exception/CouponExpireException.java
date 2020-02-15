package com.blogcode.springguide.coupon.exception;

public class CouponExpireException extends RuntimeException {
    public CouponExpireException() {
        super("쿠폰이 만료되었습니다.");
    }
}
