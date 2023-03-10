package com.miskevich.dto.city;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import javax.validation.constraints.NotNull;

@Builder
@Schema(description = "Creat city object")
public class CityCreatDto {

    @NotNull
    @Schema(example = "city name", required = true, minLength = 2, maxLength = 50)
    private String cityName;

    @Schema(example = "city address", required = true, minLength = 10, maxLength = 50)
    @NotNull
    private String address;


}
