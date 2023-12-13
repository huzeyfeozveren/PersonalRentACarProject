package com.tobeto.a.spring.intro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Table(name="customers")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="age")
    private int age;
    @Column(name="adress")
    private String adress;
    @OneToMany(mappedBy = "customerId")
    @JsonIgnore
    private List<Rental> rentals;

    @ManyToOne
    @JoinColumn(name="companies_id")
    private Company companyId;
}
