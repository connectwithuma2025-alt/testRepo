package com.ecom.auth.dto;

import lombok.Data;

@Data
public class LoginResponseDTO {
    private Long userId;
    private String username;
    private String role;
    private String message;
}
