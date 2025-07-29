package com.xworkz.springjdbc.repository;

import com.xworkz.springjdbc.dto.ContactDTO;

public interface ContactRepository {
    boolean save(ContactDTO contactDTO);
}
