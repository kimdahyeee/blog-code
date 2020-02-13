package com.blogcode.springguide.pay.domain;

import com.blogcode.springguide.account.domain.Account;
import com.blogcode.springguide.account.domain.AccountBuilder;
import com.blogcode.springguide.account.dto.MyAccountDto;
import com.blogcode.springguide.domain.CreditCard;
import com.blogcode.springguide.order.domain.Order;
import com.blogcode.springguide.order.domain.OrderBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RefundTest {

    private Account account;
    private Order order;
    private CreditCard creditCard;

    @BeforeEach
    public void setup() {
        order = OrderBuilder.build();

        account = AccountBuilder.build();

        creditCard = CreditCard.builder()
                .creditNumber("110-11111-22222")
                .creditHolder("김다혜")
                .build();
    }

    @Test
    @DisplayName("계좌 환불")
    public void byAccount() {
        final Refund refund = Refund.byAccountBuilder()
                .account(account)
                .order(order)
                .build();

        assertThat(refund.getAccount()).isEqualTo(account);
        assertThat(refund.getOrder()).isEqualTo(order);
    }

    @Test
    @DisplayName("계좌 환불 account가 null 일 때")
    public void byAccount_null_exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            final Refund refund = Refund.byAccountBuilder()
                    .account(null)
                    .order(order)
                    .build();
        });

        assertEquals("account must not be null", exception.getMessage());
    }

    @Test
    @DisplayName("카드 환불")
    public void byCredit() {
        final Refund refund = Refund.byCreditBuilder()
                .creditCard(creditCard)
                .order(order)
                .build();

        assertThat(refund.getCreditCard()).isEqualTo(creditCard);
        assertThat(refund.getOrder()).isEqualTo(order);
    }
}