package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.AdminRepo;
import com.mkpits.cablecms.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepo adminRepo;

    public Admin createAdmin(Admin admin){
        adminRepo.save(admin);
        return null;
    }
}



