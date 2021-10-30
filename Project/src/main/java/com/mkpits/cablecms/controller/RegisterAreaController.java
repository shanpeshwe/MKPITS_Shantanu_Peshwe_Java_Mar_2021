package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.model.Area;
import com.mkpits.cablecms.service.RegisterAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterAreaController {
    @Autowired
    RegisterAreaService registerAreaService;

    @RequestMapping(value="/registerarea", method = RequestMethod.POST)
    public String resgisterAreaController(@RequestParam("areaname") String areaname){

        Area area = Area.builder()
                .areaName(areaname)
                .build();
        registerAreaService.createArea(area);
        return "addarea";
    }
}
