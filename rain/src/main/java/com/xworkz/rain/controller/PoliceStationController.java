package com.xworkz.rain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PoliceStationController {
    public PoliceStationController()
    {
        System.out.println("PoliceStationController constructor");
    }

    @RequestMapping("/policeStation")
    public String onPoliceStation(@RequestParam String stationName,@RequestParam String address,@RequestParam String city,@RequestParam String district,
                                  @RequestParam String state,@RequestParam int pincode,@RequestParam long contactNumber,@RequestParam String email,
                                  @RequestParam String stationType,@RequestParam String inChargeName, Model mode)
    {
        System.out.println("PoliceStation form method");

        System.out.println("Station Name: "+stationName);
        System.out.println("Address: "+address);
        System.out.println("City: "+city);
        System.out.println("district: "+district);
        System.out.println("State: "+state);
        System.out.println("Pincode: "+pincode);
        System.out.println("Contact: "+contactNumber);
        System.out.println("Email: "+email);
        System.out.println("Station Type: "+stationType);
        System.out.println("InChargeName: "+inChargeName);

        mode.addAttribute("stationName",stationName);
        mode.addAttribute("address",address);
        mode.addAttribute("city",city);
        mode.addAttribute("district",district);
        mode.addAttribute("state",state);
        mode.addAttribute("pincode",pincode);
        mode.addAttribute("contactNumber",contactNumber);
        mode.addAttribute("email",email);
        mode.addAttribute("stationType",stationType);
        mode.addAttribute("inChargeName",inChargeName);

        return "/PoliceStationResult.jsp";
    }
}
