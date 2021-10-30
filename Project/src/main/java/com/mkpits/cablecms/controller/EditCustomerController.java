package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.model.Customer;
import com.mkpits.cablecms.service.EditCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EditCustomerController {
    @Autowired
    EditCustomerService editCustomerService;


    @RequestMapping(value="/editcustomer/{id}")
    public String editCustomerController(@PathVariable int id, ModelMap modelMap){
        modelMap.addAttribute("customer",editCustomerService.findById(id));

        //Customer customer=editCustomerService.findById(id);
        //modelMap.addAttribute("customer",customer);
        return "editcustomer";
    }

    @RequestMapping(value="/editcustomer")
    public String editCustomerController(){

        return "editcustomer";
    }
}
