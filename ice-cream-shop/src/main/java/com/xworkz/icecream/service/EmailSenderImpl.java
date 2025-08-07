package com.xworkz.icecream.service;

import com.xworkz.icecream.config.EmailConfiguration;
import com.xworkz.icecream.dto.IceCreamOrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailSenderImpl implements EmailSender{

    @Autowired
    EmailConfiguration configuration;
    
    public EmailSenderImpl()
    {
        System.out.println("Email sender Implementation constructor");
    }

    @Override
    public void mailSend(IceCreamOrderDTO dto,double price) {
        System.out.println("mailSend method in Email sender Implementation");

        MimeMessage mimeMessage=configuration.mailSender().createMimeMessage();
        try{
            MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(mimeMessage,true);
            mimeMessageHelper.setTo(dto.getEmail());
            mimeMessageHelper.setSubject("Ice Cream Order Confirmation");
            String htmlContent = "<html>" +
                    "<body>" +
                    "<h2>Hello " + dto.getName() + ",</h2>" +
                    "<p>Thank you for your order! Here are the details:</p>" +
                    "<ul>" +
                    "<li><strong>Flavour:</strong> " + dto.getFlavour() + "</li>" +
                    "<li><strong>Quantity:</strong> " + dto.getQuantity() + "</li>" +
                    "<li><strong>Take Away:</strong> " + (dto.isTakeAway() ? "Yes" : "No") + "</li>" +
                    "<li><strong>Add-On:</strong> " + (dto.isAddOn() ? "Yes" : "No") + "</li>" +
                    "<li><strong>Coupon Code:</strong> " + (dto.getCouponCode().isEmpty() ?"None":dto.getCouponCode()) + "</li>" +
                    "<li><strong>Total Price:</strong> Rs." + price + "/-</li>" +
                    "</ul>" +
                    "<p><img src='cid:gif' alt='Enjoy your ice cream!' width='300'/></p>" +
                    "<p>We hope to serve you again soon!</p>" +
                    "</body>" +
                    "</html>";
            mimeMessageHelper.setText(htmlContent,true);
            FileSystemResource fileSystemResource=new FileSystemResource("C:\\Users\\dell\\Pictures\\cat walk.gif");
            mimeMessageHelper.addInline("gif",fileSystemResource);
            configuration.mailSender().send(mimeMessage);
            System.out.println("Mail send to "+dto.getEmail());
        } catch (MessagingException e) {
            System.out.println("Error in mail: "+e.getMessage());
        }
    }
}
