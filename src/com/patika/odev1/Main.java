package com.patika.odev1;

import java.math.BigDecimal;
import com.patika.odev1.core.PaymentMethod;
import com.patika.odev1.core.PaymentProcessor;
import com.patika.odev1.registry.PaymentRegistry;
import com.patika.odev1.registry.PaymentType;
import com.patika.odev1.service.CreditCardPayment;
import com.patika.odev1.service.PayPalPayment;

public class Main {

    public static void main(String[] args) {

        PaymentRegistry.register(PaymentType.CREDIT_CARD, () -> new CreditCardPayment("1234-5678"));
        PaymentRegistry.register(PaymentType.PAYPAL, () -> new PayPalPayment("test@mail.com"));

        PaymentMethod payment = PaymentRegistry.getPayment(PaymentType.PAYPAL);
        PaymentProcessor processor = new PaymentProcessor(payment);
        processor.executePayment(BigDecimal.valueOf(500.55));

        payment = PaymentRegistry.getPayment(PaymentType.CREDIT_CARD);
        processor = new PaymentProcessor(payment);
        processor.executePayment(BigDecimal.valueOf(1000.55));
    }
}