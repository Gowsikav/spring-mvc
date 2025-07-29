package com.xworkz.springjdbc.controller;

import com.xworkz.springjdbc.dto.ContactDTO;
import com.xworkz.springjdbc.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ContactController {

    @Autowired
    private ContactServiceImpl contactServiceImpl;

    public ContactController() {
        System.out.println("ContactController constructor");
    }

    @RequestMapping("/contact")
    public String getContact(ContactDTO contactDTO, Model model) {
        System.out.println("getContact method in controller");
        System.out.println("Contact details: " + contactDTO);
        if (contactServiceImpl.validate(contactDTO)) {
            model.addAttribute("contactDTO", contactDTO);
            return "ContactSuccess";
        } else {
            System.out.println("Invalid details");
            model.addAttribute("message", "Invalid details");
            return "Contact";
        }
    }
}
