package com.example.tossapisample.toss;

import com.example.tossapisample.toss.dto.ConfirmRequestDto;
import com.example.tossapisample.toss.dto.ConfirmResponseDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;
import reactor.core.publisher.Mono;

@HttpExchange(value = "/v1/payments", accept = "application/json", contentType = "application/json")
public interface TossClient {

    @PostExchange(value = "/confirm")
    Mono<ConfirmResponseDto> confirm(@RequestBody final ConfirmRequestDto confirmRequestDto);
}
