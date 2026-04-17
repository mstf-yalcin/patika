package com.patika.odev1.registry;

import com.patika.odev1.core.PaymentMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentRegistry {

    private static final Map<PaymentType, Supplier<PaymentMethod>> registry = new HashMap<>();

    public static void register(PaymentType key, Supplier<PaymentMethod> supplier) {
        registry.put(key, supplier);
    }

    public static PaymentMethod getPayment(PaymentType key) {
        Supplier<PaymentMethod> supplier = registry.get(key);

        if (supplier == null)
            throw new IllegalArgumentException("Payment method not found: " + key);

        return supplier.get();
    }
}
