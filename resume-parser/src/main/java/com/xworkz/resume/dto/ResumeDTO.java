package com.xworkz.resume.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;

@Data
public class ResumeDTO {
    @NotNull
    @Size(min = 3, max = 25)
    private String fullName;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Digits(integer = 15, fraction = 0)
    private Long phoneNumber;

    @NotNull(message = "Please upload a file")
    private MultipartFile multipartFile;
}
