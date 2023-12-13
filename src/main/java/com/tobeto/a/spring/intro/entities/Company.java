package com.tobeto.a.spring.intro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name="companies")
@Entity
@Getter
@Setter
public class Company {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="adress")
    private String adress;

    @OneToMany(mappedBy = "companyId")
    @JsonIgnore
    private List<Customer> customers;

    @ManyToOne
    @JoinColumn(name="origin_id")
    private Origin originId;

}
