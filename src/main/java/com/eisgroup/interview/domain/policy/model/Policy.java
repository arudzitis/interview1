package com.eisgroup.interview.domain.policy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.id.UUIDGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Policy {
    @Id
    @Type(type="uuid-char")
    @SequenceGenerator(name = UUIDGenerator.GENERATOR_NAME)
    private UUID id;
    private String type;
    private LocalDate issued;
    private String policyNumber;
    private String partyLink;
}
