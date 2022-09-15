package com.eisgroup.interview.domain.policy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportDTO {
    private UUID policyId;
    private String policyNumber;
    private int quoteCount;
}
