package com.mkpits.cablecms.service;

import com.mkpits.cablecms.model.SearchCustomer;

public interface SearchCustomerService {

    public Iterable<SearchCustomer> findAll();
}
