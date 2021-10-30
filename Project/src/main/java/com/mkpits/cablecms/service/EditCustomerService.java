package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.CustomerRepo;
import com.mkpits.cablecms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EditCustomerService {
    @Autowired
    CustomerRepo customerRepo;

    public Customer findById(int id){
        Optional<Customer> customer=customerRepo.findById(id);
        return customer.orElse(null);
    }
}
