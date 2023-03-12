package com.miskevich.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
@EqualsAndHashCode(exclude = {"role", "contracts"})
@ToString(exclude = {"role", "contracts"})
public class User extends AnEntity {

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


    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @JsonManagedReference
    Set<Contract> contracts;


}
