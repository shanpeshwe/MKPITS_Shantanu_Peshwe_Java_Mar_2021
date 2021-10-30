
package com.mkpits.cablecms.service;

import com.mkpits.cablecms.dao.DashboardRepo;
import com.mkpits.cablecms.model.Dashboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DashboardService {

    @Autowired
    DashboardRepo dashboardRepo;

    public Iterable<Dashboard> findByMonth(String month){

        return dashboardRepo.findByMonth(month);
    }
}

