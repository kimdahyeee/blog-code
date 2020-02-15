package com.blogcode.springguide.coupon.exception;

public class CouponAlreadyUsedException extends RuntimeException {
    public CouponAlreadyUsedException() {
        super("쿠폰이 이미 사용되었습니다.");
    }
}
