package com.mkpits.cablecms.dao;

import com.mkpits.cablecms.model.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DashboardRepo extends JpaRepository<Dashboard,Integer> {

    @Query("FROM Dashboard d WHERE d.month = :month")
    Iterable<Dashboard> findByMonth(String month);
}
