package com.xworkz.fastfood.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class StudentDTO {

    private Integer studentId;

    @NotBlank
    @Size(min = 2,max=30)
    private String name;

    @Email
    private String email;

    @NotBlank
    @Size(min = 10,max=12)
    private String phoneNumber;
}
