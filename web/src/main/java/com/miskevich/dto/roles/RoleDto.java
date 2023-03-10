package com.miskevich.dto.roles;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Schema(description = "Update role object")
public class RoleDto {

    @Schema(example = "role id", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private int id;

    @Schema(example = "role name", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private String roleName;
}
