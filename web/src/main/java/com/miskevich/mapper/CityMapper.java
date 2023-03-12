package com.miskevich.mapper;

import com.miskevich.controller.dto.city.CityDto;
import com.miskevich.entity.City;
import org.mapstruct.Mapper;

@Mapper
public interface CityMapper {

    CityDto cityDto(City city);


}
