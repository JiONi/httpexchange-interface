package com.example.tossapisample.toss.dto;

import lombok.Getter;
import lombok.Value;

import java.time.ZonedDateTime;

@Value
public class ConfirmResponseDto {
    // 리스폰스 필드 너무 많아서 다 못 적었음.. 대충 필요한거 추가해서 사용하면 됨
    private final String mId;
    private final String lastTransactionKey;
    private final String paymentKey;
    private final String orderId;
    private final String orderName;
    private final int taxExemptionAmount;
    private final PaymentStatus status;
    private final ZonedDateTime requestedAt;
    private final ZonedDateTime approvedAt;
    private final boolean useEscrow;
    private final boolean cultureExpense;
    private final String currency;
    private final String method;
    private final int totalAmount;
    private final int balanceAmount;
    private final int suppliedAmount;
    private final int vat;
    private final int taxFreeAmount;
}
