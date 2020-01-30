package com.example.demoSrpingApplication.lead;

import java.util.List;

/**
 * @author : Prasad Dukale, created on 30-Jan-2020
 **/
public interface LeadService {
    public Lead createLead(Lead lead);
    public List<Lead> getAllLead();
}
