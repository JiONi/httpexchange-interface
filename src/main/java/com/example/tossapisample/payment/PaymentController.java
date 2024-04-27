package com.example.tossapisample.payment;

import com.example.tossapisample.payment.dto.PaymentConfirmRequestDto;
import com.example.tossapisample.payment.dto.PaymentConfirmResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping("/payments/confirm")
    public Mono<PaymentConfirmResponseDto> confirmPayment(@RequestBody final PaymentConfirmRequestDto paymentConfirmDto) {
        return this.paymentService.confirm(paymentConfirmDto);
    }
}
