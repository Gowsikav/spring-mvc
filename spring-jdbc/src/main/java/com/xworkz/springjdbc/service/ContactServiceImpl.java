package com.xworkz.springjdbc.service;

import com.xworkz.springjdbc.dto.ContactDTO;
import com.xworkz.springjdbc.repository.ContactRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactRepositoryImpl contactRepositoryImpl;

    public ContactServiceImpl()
    {
        System.out.println("ContactServiceImpl constructor");
    }
    @Override
    public boolean validate(ContactDTO contactDTO) {
        System.out.println("validate method in ContactServiceImplementation");
        if(contactDTO!=null)
        {
            System.out.println("contactDto is not null");
        }
        else {
            System.out.println("ContactDto is null");
            return false;
        }
        String name= contactDTO.getName();
        if(name!=null && name.length()>3 && name.length()<25)
        {
            System.out.println("name is valid");
        }
        else {
            System.out.println("name is not valid");
            return false;
        }

        String email= contactDTO.getEmail();
        if(email!=null && email.contains("@gmail.com"))
        {
            System.out.println("email is valid");
        }
        else {
            System.out.println("email is not valid");
            return false;
        }
        String phoneStr= contactDTO.getPhoneNumber();
        long phoneNumber=0;
        if(phoneStr!=null && phoneStr.length()==10)
        {
            phoneNumber=Long.parseLong(phoneStr);
            System.out.println("phone number is valid");
        }
        else {
            System.out.println("phone number is not valid");
            return false;
        }

        String comments= contactDTO.getComments();
        if(comments!=null && comments.length()>3 && comments.length()<150)
        {
            System.out.println("comments is valid");
        }
        else {
            System.out.println("comments is not valid");
            return false;
        }
        System.out.println("All details are valid");
        return contactRepositoryImpl.save(contactDTO);
    }
}
