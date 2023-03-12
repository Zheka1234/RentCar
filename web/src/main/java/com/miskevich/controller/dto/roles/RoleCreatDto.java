package com.miskevich.controller.dto.roles;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Schema(description = "Creat role object")
public class RoleCreatDto {

    @NotNull
    @Schema(example = "ROLE_TEST", required = true, minLength = 2, maxLength = 50)
    private String roleName;
}