package com.swlodyga.pgsSpringBoot.model;

import javax.persistence.*;

@Entity
@Table(name = "activities")
public class Activities {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String usersList;
    @Column(nullable = false)
    private String teatcher;
}
