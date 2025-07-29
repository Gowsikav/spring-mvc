package com.xworkz.springjdbc.repository;

import com.xworkz.springjdbc.dto.ContactDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class ContactRepositoryImpl implements ContactRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ContactRepositoryImpl() {
        System.out.println("ContactRepositoryImpl constructor");
    }

    @Override
    public boolean save(ContactDTO contactDTO) {
        System.out.println("save method in ContactRepositoryImplementation");

        String query = "insert into contact_details values(0,?,?,?,?,?);";
        int row = jdbcTemplate.update(query, contactDTO.getName(), contactDTO.getEmail(),Long.parseLong(contactDTO.getPhoneNumber()), contactDTO.getComments(), LocalDateTime.now());
        System.out.println("row: " + row);
        if (row > 0) {
            System.out.println("Data is inserted");
            return true;
        } else {
            System.out.println("Row is not inserted");
            return false;
        }
    }
}
