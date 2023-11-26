package com.example.course_creation.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="Specializations")
public class specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="specialization_id")
    private Integer specializationId;
    @Column(name="code",unique = true, nullable = false)
    private String code;
    @Column(name="name",nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "Course_Specialization", joinColumns = {@JoinColumn(name="specialization_id")},
            inverseJoinColumns = {@JoinColumn(name="course_id")})
    private List<course> courses;
}
