
package com.mkpits.cablecms.service;
import com.mkpits.cablecms.dao.CustomerRepo;
import com.mkpits.cablecms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RegisterCustomerService {
    @Autowired
    CustomerRepo customerRepo;

    public Customer createCustomer(Customer customer){
        customerRepo.save(customer);
        return null;
    }

}

