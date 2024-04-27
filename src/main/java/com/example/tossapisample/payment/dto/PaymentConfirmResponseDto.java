package com.example.tossapisample.payment.dto;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class PaymentConfirmResponseDto {
    private final String orderId;
    private final String orderName;
}
