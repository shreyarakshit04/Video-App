package com.dp.hloworld.config;

import lombok.Data;

@Data
public class JwtResponse {
    String response;

    public JwtResponse(String response) {
        this.response = response;
    }

    public JwtResponse() {
    }
}
