package com.miskevich.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
public class Credentials {

    @Column(name = "login_user")
    private String userLogin;

    @JsonIgnore
    @Column(name = "password_user")
    private String userPassword;

    @Column(name = "email")
    private String email;
}