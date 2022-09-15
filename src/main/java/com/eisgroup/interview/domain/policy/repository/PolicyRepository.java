package com.eisgroup.interview.domain.policy.repository;

import com.eisgroup.interview.domain.policy.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, UUID> {

    List<Policy> findAll();

    default Stream<Policy> loadAllPolicyRecords(){
        return this.findAll().stream();
    }
}
