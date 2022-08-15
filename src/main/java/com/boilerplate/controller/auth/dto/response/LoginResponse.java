package com.boilerplate.controller.auth.dto.response;

import com.boilerplate.service.auth.dto.response.TokenResponseDto;
import lombok.*;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
public class LoginResponse {

    private Long userId;
    private TokenResponseDto token;

    public static LoginResponse of(Long userId, TokenResponseDto token) {
        return LoginResponse.builder()
                .userId(userId)
                .token(token)
                .build();
    }
}
