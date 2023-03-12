package com.miskevich.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "city")
@EqualsAndHashCode(exclude = {"car"})
@ToString(exclude = {"car"})
public class City extends AnEntity {

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "address")
    private String address;

    @OneToMany(mappedBy = "city", fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<Car> car;
}
