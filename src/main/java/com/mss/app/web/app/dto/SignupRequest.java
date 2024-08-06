package com.mss.app.web.app.dto;
import lombok.Data;

@Data
public class SignupRequest {

	private String name;
	private String email;
	private String password;

}