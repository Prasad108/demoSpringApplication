package com.example.demoSrpingApplication.lead;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Prasad Dukale, created on 30-Jan-2020
 **/
@Repository
public interface LeadRepository extends JpaRepository<Lead,Integer> {
}
