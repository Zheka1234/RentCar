package com.miskevich.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@javax.persistence.Entity
@Table(name = "user")
@EqualsAndHashCode(exclude = {"roles"})
@ToString(exclude = {"roles"})
public class User extends Entity{

    @Column(name = "user_name")
    private String userName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "mobile")
    private String mobile;

    @Embedded
    private Credentials credentials;

    @ManyToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("user")
    private Set<Role> role;
}
