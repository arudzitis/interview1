package com.eisgroup.interview.domain.policy.controller;

import com.eisgroup.interview.domain.policy.model.Policy;
import com.eisgroup.interview.domain.policy.model.ReportDTO;
import com.eisgroup.interview.domain.policy.services.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class PolicyController {

    @Autowired
    private PolicyService policyService;
    
    @GetMapping("/")
    public List<Policy> getAllRecords(){
        return policyService.findAllPolicies();
    }

    // TODO: implement this method to provide correct response
    @GetMapping("/report")
    public List<ReportDTO> getReport(){
        return Collections.emptyList();
    }
}
