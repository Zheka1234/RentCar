package com.miskevich.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Schema(description = "Update user object")
public class UserDto {

    @Schema(example = "user id", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private int id;

    @Schema(example = "user name", required = true, minLength = 1, maxLength = 20)
    @NotNull
    private String userName;

    @Schema(example = "surname", required = true, minLength = 10, maxLength = 100)
    @NotNull
    private String surname;

    @Schema(example = "+375445554432", required = true, minLength = 10, maxLength = 20)
    @NotNull
    private String mobile;

    @Schema(example = "login", required = true, minLength = 10, maxLength = 100)
    @NotNull
    private String loginUser;

    @Schema(example = "password", required = true, minLength = 1, maxLength = 200)
    @NotNull
    private String passwordUser;

    @Schema(example = "email", required = true, minLength = 10, maxLength = 100)
    @NotNull
    @Email
    private String email;
}
