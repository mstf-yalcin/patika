package com.patika.odev1.service;

import com.patika.odev1.core.PaymentMethod;

import java.math.BigDecimal;

public class PayPalPayment implements PaymentMethod {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(amount + "TL paid via PayPal. Account: " + email);
    }
}
