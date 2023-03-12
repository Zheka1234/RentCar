package com.miskevich.controller.dto.cotract;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import javax.validation.constraints.NotNull;

@Builder
@Schema(description = "Creat contract object")
public class ContractCreatDto {

    @Schema(example = "contract number", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private String contractNumber;

    @Schema(example = "passport", required = true, minLength = 10, maxLength = 100)
    @NotNull
    private String passport;

    @Schema(example = "car id", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private int carId;

    @Schema(example = "user id", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private int userId;
}
