package com.example.demoSrpingApplication.lead;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Prasad Dukale, created on 30-Jan-2020
 **/

@RestController
public class LeadController {

    @Autowired
    LeadService leadService;

    @GetMapping("/lead/{id}")
    public Lead getLeadById(@PathVariable int id){
        return new Lead(id, "Smith", "Jadhav", "smjadhav@ccrn.com");
    }

    @GetMapping("/lead")
    public List<Lead> getAllLeads(){
       return leadService.getAllLead();
    }

    @PostMapping("/lead")
    public Lead saveLead(@RequestBody Lead lead){
        return leadService.createLead(lead);
    }


}
