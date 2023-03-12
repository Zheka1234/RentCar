package com.miskevich.mapper;

import com.miskevich.controller.dto.car.CarDto;
import com.miskevich.entity.Car;
import org.mapstruct.Mapper;

@Mapper
public interface CarMapper {

    CarDto toCarResponse(Car car);
}
