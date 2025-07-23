package com.xworkz.rain.controller;

import com.xworkz.rain.dto.PoliceStationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PoliceStationController {
    public PoliceStationController()
    {
        System.out.println("PoliceStationController constructor");
    }

    @RequestMapping("/policeStation")
    public String onPoliceStation(PoliceStationDTO policeStationDTO, Model mode)
    {
        System.out.println("PoliceStation form method");

        System.out.println("Police Station Details: "+policeStationDTO);

        mode.addAttribute("policeStationDTO",policeStationDTO);

        return "/PoliceStationResult.jsp";
    }
}
