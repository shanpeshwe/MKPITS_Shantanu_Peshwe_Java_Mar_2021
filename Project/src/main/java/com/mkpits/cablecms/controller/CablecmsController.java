package com.mkpits.cablecms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CablecmsController {

    @GetMapping("/")
    public String homecontroller() {
        return "login";
    }

    @GetMapping("/register")
    public String registerController(){
        return "register";
    }

    @GetMapping("/forgotpassword")
    public String forgotpasswordController(){
        return "forgotpassword";
    }

    @GetMapping("/searchreceipt")
    public String searchreceiptController() {
        return "searchreceipt";
    }

    @GetMapping("/makereceipt")
    public String makereceiptController() {
        return "makereceipt";
    }

    @GetMapping("/customerbilling")
    public String customerbillingController() {
        return "customerbilling";
    }

    @GetMapping("/addcustomer")
    public String addcustomerController() {
        return "addcustomer";
    }

    @GetMapping("/addarea")
    public String addareaController() {
        return "addarea";
    }

    @GetMapping("/addpackage")
    public String addpackageController() {
        return "addpackage";
    }

    @GetMapping("/manageprofile")
    public String manageprofileController() {
        return "manageprofile";
    }


}
