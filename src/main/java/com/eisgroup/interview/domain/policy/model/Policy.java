package com.eisgroup.interview.domain.policy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Policy {
    @Id
    @Column(columnDefinition = "CHARACTER VARYING(40)")
    private UUID id;
    private String type;
    private LocalDate issued;
    private String policyNumber;
    private String partyLink;
}
