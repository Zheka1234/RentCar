package com.miskevich.controller;


import com.miskevich.Service.CarService;
import com.miskevich.controller.dto.car.CarDto;
import com.miskevich.mapper.CarMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Car controller")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/car")
public class CarController {

    private final CarService carService;

    private final CarMapper carMapper;

    @GetMapping
    public ResponseEntity<Object> findAllCarr(@ParameterObject Pageable page) {
        Page<CarDto> carResponseList = carService.findAll(page).map(carMapper::toCarResponse);
        return new ResponseEntity<>(carResponseList, HttpStatus.OK);
    }
}
