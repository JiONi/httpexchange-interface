package com.example.tossapisample.config;

import com.example.tossapisample.toss.TossClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebClientConfig {
    @Bean
    TossClient tossClient() {
        // 시크릿키 원래 이렇게 하면 절대 안 됨...! 일단 귀찮아서 이렇게 하긴 했는데, 시크릿 매니저로 등록하던가 해서 꼭 숨겨야함.
        final String secretKey = "dGVzdF9za195WnFta0tlUDhnMkFhWnBEbFI1QnJiUVJ4QjlsOg==";
        final WebClient webClient = WebClient.builder()
                .baseUrl("https://api.tosspayments.com")
                .defaultHeader(HttpHeaders.AUTHORIZATION, "Basic " + secretKey)
                .build();;
        final HttpServiceProxyFactory httpServiceProxyFactory =
                HttpServiceProxyFactory.builderFor(WebClientAdapter.create(webClient))
                        .build();
        return httpServiceProxyFactory.createClient(TossClient.class);
    }
}
