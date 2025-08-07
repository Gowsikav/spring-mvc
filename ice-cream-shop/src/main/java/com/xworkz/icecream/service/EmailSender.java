package com.xworkz.icecream.service;

import com.xworkz.icecream.dto.IceCreamOrderDTO;

public interface EmailSender {

    void mailSend(IceCreamOrderDTO iceCreamOrderDTO,double price);

}
