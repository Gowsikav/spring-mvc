package com.xworkz.springjdbc.service;

import com.xworkz.springjdbc.dto.ContactDTO;

public interface ContactService {
    boolean validate(ContactDTO contactDTO);
}
