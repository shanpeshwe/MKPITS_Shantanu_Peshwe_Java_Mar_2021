package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.AddAreaRepo;
import com.mkpits.cablecms.model.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterAreaService {
    @Autowired
    AddAreaRepo addAreaRepo;

    public Area createArea(Area area){
        addAreaRepo.save(area);
        //adminRepo.findOne();
        return null;
    }

}
