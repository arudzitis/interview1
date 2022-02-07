package com.eisgroup.interview.domain.policy.repository;

import com.eisgroup.interview.domain.policy.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, UUID> {
}
