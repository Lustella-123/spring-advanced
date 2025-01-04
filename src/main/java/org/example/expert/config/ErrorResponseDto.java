package org.example.expert.config;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ErrorResponseDto {
    private final HttpStatus status;
    private final String exception;
    private final String message;

    public ErrorResponseDto(HttpStatus status, String exception, String message) {
        this.status = status;
        this.exception = exception;
        this.message = message;
    }
}
