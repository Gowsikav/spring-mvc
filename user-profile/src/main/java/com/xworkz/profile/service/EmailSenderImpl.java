package com.xworkz.profile.service;

import com.xworkz.profile.config.EmailConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderImpl implements EmailSender{

    @Autowired
    EmailConfiguration configuration;

    public EmailSenderImpl()
    {
        System.out.println("EmailSenderImpl constructor");
    }

    @Override
    public void mailSend(String email, String otp) {

        System.out.println("mailSend method");
        SimpleMailMessage simpleMailMessage= new SimpleMailMessage();
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject("Otp to login");
        simpleMailMessage.setText("Otp for login "+otp);
        configuration.mailSender().send(simpleMailMessage);
        System.out.println("mail sent to :"+email+" - OTP : "+otp);
    }
}
