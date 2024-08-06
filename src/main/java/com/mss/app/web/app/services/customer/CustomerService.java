package com.mss.app.web.app.services.customer;

import java.util.List;

import com.mss.app.web.app.dto.BookACarDto;
import com.mss.app.web.app.dto.CarDto;



public interface CustomerService {

    List<CarDto> getAllCars();

    boolean bookACar(BookACarDto bookACarDto);

    CarDto getCarById(Long id);

    List<BookACarDto> getBookingsByUserId(Long id);

}