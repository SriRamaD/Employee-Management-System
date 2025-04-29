package com.example.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//To transfer the data between client and server (we use this as a response for APIs)
public class EmployeeDto {
    private long Id;
    private String firstName;
    private String lastName;
    private String email;
}
