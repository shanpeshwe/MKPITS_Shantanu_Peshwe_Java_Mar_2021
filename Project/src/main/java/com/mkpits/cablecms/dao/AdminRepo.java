
package com.mkpits.cablecms.dao;

import com.mkpits.cablecms.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AdminRepo extends JpaRepository<Admin,Integer> {

    @Query("FROM Admin a WHERE a.userName = :username and a.password = :password")
    Optional<Admin> findByUsername(String username, String password);
}

