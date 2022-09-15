package com.eisgroup.interview.domain.policy.services;

import com.eisgroup.interview.domain.policy.model.Policy;
import com.eisgroup.interview.domain.policy.model.ReportDTO;
import com.eisgroup.interview.domain.policy.repository.PolicyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PolicyServiceImpl implements PolicyService {
    private PolicyRepository policyRepository;

    public PolicyServiceImpl(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    @Override
    public List<Policy> findAllPolicies() {
        return policyRepository.loadAllPolicyRecords()
                .collect(Collectors.toList());
    }

    // TODO: implement this method to provide correct response
    @Override
    public List<ReportDTO> loadReport() {
        return null;
    }

}
