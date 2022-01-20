package com.example.projetsoa.administrator;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Administrator {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private String job;
}
