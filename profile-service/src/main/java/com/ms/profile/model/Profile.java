package com.ms.profile.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Profile extends BaseModel{

    private String fname;
    private String lname;
    private String email;

    private String phone;
    private String gender;
    private LocalDate dob;

}
