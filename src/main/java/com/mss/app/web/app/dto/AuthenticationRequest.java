package com.mss.app.web.app.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {

	private String email;
    private String password;

}