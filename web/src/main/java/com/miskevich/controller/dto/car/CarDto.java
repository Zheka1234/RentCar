package com.miskevich.controller.dto.car;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Schema(description = "Update car object")
public class CarDto {


    private int id;


    private String brand;


    private String model;


    private String color;


    private Double price;


    private int cityId;
}
