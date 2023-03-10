package com.miskevich.dto.car;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Schema(description = "Update car object")
public class CarDto {

    @Schema(example = "car id", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private int id;

    @Schema(example = "brand", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private String brand;

    @Schema(example = "model", required = true, minLength = 10, maxLength = 100)
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
