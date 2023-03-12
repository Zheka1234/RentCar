package com.miskevich.controller;


import com.miskevich.Service.CityService;
import com.miskevich.controller.dto.city.CityDto;
import com.miskevich.mapper.CityMapper;
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

@RestController
@RequiredArgsConstructor
@RequestMapping("/rest")
@Tag(name = "City controller")
public class CityController {

    private final CityService cityService;

    private final CityMapper cityMapper;

    @GetMapping
    public ResponseEntity<Object> findAllCity(@ParameterObject Pageable page) {

        Page<CityDto> cityDto =
                cityService.findAll(page).map(cityMapper::cityDto);

        return new ResponseEntity<>(cityDto, HttpStatus.OK);

    }
}

