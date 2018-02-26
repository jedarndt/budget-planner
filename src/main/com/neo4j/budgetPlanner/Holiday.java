package com.neo4j.budgetPlanner;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Holiday {

    @Id
    private String id;
    private String destination;
    private String date;

}
