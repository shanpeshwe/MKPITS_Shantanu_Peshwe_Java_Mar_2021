package com.mkpits.cablecms.dao;

import com.mkpits.cablecms.model.SearchCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository("customerRepo")
public interface SearchCustomerRepo extends JpaRepository<SearchCustomer,Integer>{
//    Customer findByUserName(String username);
}

