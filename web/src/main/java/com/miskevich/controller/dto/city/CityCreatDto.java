package com.miskevich.controller.dto.city;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Schema(description = "Creat city object")
public class CityCreatDto {

    @NotNull
    @Schema(example = "city name", required = true, minLength = 2, maxLength = 50)
    private String cityName;

    @Schema(example = "address", required = true, minLength = 10, maxLength = 50)
    @NotNull
    private String address;


}
