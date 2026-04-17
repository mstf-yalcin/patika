package com.patika.odev1.core;

import java.math.BigDecimal;

public class PaymentProcessor {

    private final PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        if (paymentMethod == null)
            throw new IllegalArgumentException("PaymentMethod must not be null");

        this.paymentMethod = paymentMethod;
    }

    public void executePayment(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Amount must be greater than zero");

        paymentMethod.pay(amount);
    }
}
