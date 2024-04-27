package com.example.tossapisample.payment.dto;

import lombok.Value;

@Value
public class PaymentConfirmRequestDto {
    private final String paymentKey;
    private final String orderId;
    private final int amount;
}
