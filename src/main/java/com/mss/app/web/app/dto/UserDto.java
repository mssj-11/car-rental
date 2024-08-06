package com.mss.app.web.app.dto;

import com.mss.app.web.app.enums.UserRole;
import lombok.Data;


@Data
public class UserDto {

	private Long id;
	private String name;
	private String email;
	private UserRole userRole;

}