package com.eisgroup.interview.domain.policy.services;

import com.eisgroup.interview.domain.policy.model.Policy;
import com.eisgroup.interview.domain.policy.model.ReportDTO;

import java.util.List;

public interface PolicyService {
    List<Policy> findAllPolicies();

    List<ReportDTO> loadReport();
}
