package com.hospital.almenara.payload.request;

import lombok.Data;

@Data
public class SignUpRequest {

    private String username;
    private String role;
    private String password;
}
