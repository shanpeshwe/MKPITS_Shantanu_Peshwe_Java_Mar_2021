

package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.AdminRepo;
import com.mkpits.cablecms.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    AdminRepo adminRepo;

    public Admin findByUserName(String username,String password){
        Optional<Admin> admin=adminRepo.findByUsername(username,password);
        return admin.orElse(null);
    }
}




