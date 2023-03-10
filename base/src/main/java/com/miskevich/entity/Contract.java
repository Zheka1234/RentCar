package com.miskevich.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "contract")
@EqualsAndHashCode(exclude = {"car", "user"})
@ToString(exclude = {"car", "user"})
public class Contract extends AnEntity {

    @Column(name = "contract_number")
    private String contractNumber;

    @Column(name = "passport")
    private String passport;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
}
