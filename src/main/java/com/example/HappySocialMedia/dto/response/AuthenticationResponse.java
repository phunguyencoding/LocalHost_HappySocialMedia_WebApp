package com.example.HappySocialMedia.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

// Create an AuthenticationResponse that contains authenticationToken and username
public class AuthenticationResponse {
    private String authenticationToken;
    private String username;
}
