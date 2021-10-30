package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.model.Admin;
import com.mkpits.cablecms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterAdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping(value="/registeradmin", method = RequestMethod.POST)
    public String registerAdminController(@RequestParam("username") String username,
                                          @RequestParam("companyname") String companyname,
                                          @RequestParam("email") String email,
                                          @RequestParam("password") String password,
                                          @RequestParam("contactnumber") String contactnumber){
        Admin admin= Admin.builder()
                .companyName(companyname)
                .userName(username)
                .emailAddress(email)
                .password(password)
                .contactNumber(contactnumber)
                .build();
        adminService.createAdmin(admin);
        return "register";
    }
}
