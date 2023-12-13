package com.tobeto.a.spring.intro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table (name="brands")
@Entity
@Getter
@Setter
public class Brand {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="name")
    private String brandName;

    @OneToMany(mappedBy = "brandId")
    @JsonIgnore
    private List<Car> cars;

    @ManyToOne
    @JoinColumn(name="origin_id")
    private Origin originId;
}
