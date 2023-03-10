package com.miskevich.dto.city;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Schema(description = "Update city object")
public class CityDto {

    @Schema(example = "city id", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private int id;

    @Schema(example = "city name", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private String cityName;

    @Schema(example = "address", required = true, minLength = 10, maxLength = 100)
    @NotNull
    private String address;
}
