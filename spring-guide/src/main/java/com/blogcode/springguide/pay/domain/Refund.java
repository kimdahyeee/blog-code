package com.blogcode.springguide.pay.domain;

import com.blogcode.springguide.account.domain.Account;
import com.blogcode.springguide.domain.CreditCard;
import com.blogcode.springguide.order.domain.Order;
import lombok.Builder;
import lombok.Getter;
import org.springframework.util.Assert;

@Getter
public class Refund {
    private Long id;
    private Account account;
    private CreditCard creditCard;
    private Order order;

    @Builder(builderMethodName = "of", builderClassName = "of")
    private Refund(Account account, CreditCard creditCard, Order order) {
        this.account = account;
        this.creditCard = creditCard;
        this.order = order;
    }

    @Builder(builderClassName = "byAccountBuilder", builderMethodName = "byAccountBuilder")
    public static Refund byAccount(Account account, Order order) {
        Assert.notNull(account, "account must not be null");
        Assert.notNull(order, "order must not be null");

        return Refund.of().account(account).order(order).build();
    }

    @Builder(builderClassName = "byCreditBuilder", builderMethodName = "byCreditBuilder")
    public static Refund byCredit(CreditCard creditCard, Order order) {
        Assert.notNull(creditCard, "creditCard must not be null");
        Assert.notNull(order, "order must not be null");

        return Refund.of().creditCard(creditCard).order(order).build();
    }
}
