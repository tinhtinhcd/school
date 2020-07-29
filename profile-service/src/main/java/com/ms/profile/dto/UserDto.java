package com.ms.profile.dto;

import com.ms.profile.model.Address;
import com.ms.profile.model.Profile;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Data
public class UserDto {

    private String username;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToOne
    private Profile profile;
}
