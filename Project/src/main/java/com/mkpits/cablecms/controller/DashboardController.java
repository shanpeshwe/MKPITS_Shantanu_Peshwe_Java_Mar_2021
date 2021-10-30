
package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    DashboardService dashboardService;

    @RequestMapping(method = RequestMethod.GET)
    public String dashboardController(ModelMap modelMap){
        //Date d=new Date();
        //Dashboard dashboard=dashboardServiceImpl.findByMonth((d.getMonth()+1));
        modelMap.put("dashboard", dashboardService.findByMonth(String.valueOf(10)));

        return "dashboard";
    }

}

