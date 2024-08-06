package com.mss.app.web.app.dto;

import java.util.Date;

import com.mss.app.web.app.enums.BookCarStatus;

import lombok.Data;



@Data
public class BookACarDto {

	private Long id;
	private Date fromDate;
	private Date toDate;
	private Long days;
	private Long price;
	private BookCarStatus bookCarStatus;
	private Long carId;
	private Long userId;
	private String username;
	private String email;

}