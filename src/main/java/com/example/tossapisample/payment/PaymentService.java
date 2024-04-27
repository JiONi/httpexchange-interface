package com.example.tossapisample.payment;

import com.example.tossapisample.payment.dto.PaymentConfirmRequestDto;
import com.example.tossapisample.payment.dto.PaymentConfirmResponseDto;
import com.example.tossapisample.toss.TossClient;
import com.example.tossapisample.toss.dto.ConfirmRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PaymentService {
    private final TossClient tossClient;

    public Mono<PaymentConfirmResponseDto> confirm(final PaymentConfirmRequestDto paymentConfirmDto) {
        final ConfirmRequestDto confirmRequestDto = ConfirmRequestDto.builder()
                .paymentKey(paymentConfirmDto.getPaymentKey())
                .orderId(paymentConfirmDto.getOrderId())
                .amount(paymentConfirmDto.getAmount())
                .build();
        return tossClient.confirm(confirmRequestDto)
                .map(res -> PaymentConfirmResponseDto.builder()
                        .orderId(res.getOrderId())
                        .orderName(res.getOrderName())
                        .build());
    }
}
