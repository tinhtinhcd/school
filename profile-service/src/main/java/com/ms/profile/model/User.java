package com.ms.profile.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Data
public class User extends BaseModel {

    private String username;
    private String password;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToOne
    private Profile profile;

}