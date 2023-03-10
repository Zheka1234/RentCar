package com.miskevich.dto.roles;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import javax.validation.constraints.NotNull;

@Builder
@Schema(description = "Creat role object")
public class RoleCreatDto {

    @NotNull
    @Schema(example = "role name", required = true, minLength = 2, maxLength = 50)
    private String roleName;
}