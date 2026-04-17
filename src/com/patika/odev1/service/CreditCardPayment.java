package com.patika.odev1.service;

import com.patika.odev1.core.PaymentMethod;

import java.math.BigDecimal;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(amount + "TL paid via Credit card. Card number: " + cardNumber);
    }
}