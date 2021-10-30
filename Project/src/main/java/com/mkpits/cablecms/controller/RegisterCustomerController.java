package com.mkpits.cablecms.controller;

import com.mkpits.cablecms.model.Customer;
import com.mkpits.cablecms.model.SearchCustomer;
import com.mkpits.cablecms.service.RegisterCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterCustomerController {
    @Autowired
    RegisterCustomerService registerCustomerService;

    @RequestMapping(value="/registercustomer", method = RequestMethod.POST)
    public String resgisterCustomerController(@RequestParam("firstname") String firstname,
                                          @RequestParam("lastname") String lastname,
                                          @RequestParam("phoneno") String phoneno,
                                          @RequestParam("address") String address,
                                              @RequestParam("email") String email,
                                          @RequestParam("packageamount") String packageamount,
                                          @RequestParam("area") String area,
                                          @RequestParam("balance") String balance,
                                          @RequestParam("setupboxno") String setupboxno,
                                          @RequestParam("status") String status){
        Customer customer= Customer.builder()
                .firstName(firstname)
                .lastName(lastname)
                .phoneNo(phoneno)
                .address(address)
                .email(email)
                .packageAmount(packageamount)
                .area(area)
                .balance(balance)
                .setupBoxNo(setupboxno)
                .status(status)
                .build();
        registerCustomerService.createCustomer(customer);
        return "addcustomer";
    }

}
