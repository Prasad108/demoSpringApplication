package com.example.demoSrpingApplication.lead;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Prasad Dukale, created on 30-Jan-2020
 **/
@Service
public class LeadServiceImpl implements LeadService
{

    @Autowired
    LeadRepository leadRepository;

    @Override
    public Lead createLead(Lead lead) {
        return leadRepository.save(lead);
    }

    @Override
    public List<Lead> getAllLead() {
        return leadRepository.findAll();
    }
}
