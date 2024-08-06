package com.mss.app.web.app.services.auth;

import com.mss.app.web.app.dto.SignupRequest;
import com.mss.app.web.app.dto.UserDto;


public interface AuthService {

	UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);

}