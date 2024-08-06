package com.mss.app.web.app.services.admin;

import java.io.IOException;
import java.util.List;

import com.mss.app.web.app.dto.BookACarDto;
import com.mss.app.web.app.dto.CarDto;
import com.mss.app.web.app.dto.CarDtoListDto;
import com.mss.app.web.app.dto.SearchCarDto;


public interface AdminService {

	boolean postCar(CarDto carDto) throws IOException;

    List<CarDto> getAllCars();

    void deleteCar(Long id);

    CarDto getCarById(Long id);

    boolean updateCar(Long id, CarDto carDto) throws IOException;

    List<BookACarDto> getBookings();


    boolean changeBookingStatus(Long id, String status);

    CarDtoListDto searchCar(SearchCarDto searchCarDto);

}