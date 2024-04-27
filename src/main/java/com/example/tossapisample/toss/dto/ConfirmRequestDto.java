package com.example.tossapisample.toss.dto;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ConfirmRequestDto {
    private final String paymentKey;
    private final String orderId;
    private final int amount;
}
