package com.tobeto.a.spring.intro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name="origin")
@Entity
@Getter
@Setter
public class Origin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "originId")
    @JsonIgnore
    private List<Company>companies;

    @OneToMany(mappedBy = "originId")
    @JsonIgnore
    private List<Brand>brands;
}
