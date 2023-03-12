package com.miskevich.controller.dto.car;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Schema(description = "Creat car object")
public class CarCreatDto {

    @NotNull
    @Schema(example = "brand", required = true, minLength = 2, maxLength = 50)
    private String brand;

    @Schema(example = "model", required = true, minLength = 10, maxLength = 50)
    @NotNull
    private String model;

    @Schema(example = "color", required = true, minLength = 10, maxLength = 100)
    @NotNull
    private String color;

    @Schema(example = "10000", required = true, minLength = 10, maxLength = 1000000)
    @NotNull
    private Double price;

    @Schema(example = "city id", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private int cityId;
}
