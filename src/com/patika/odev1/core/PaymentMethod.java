package com.patika.odev1.core;

import java.math.BigDecimal;

public interface PaymentMethod {
    void pay(BigDecimal amount);
}
