package com.tobeto.a.spring.intro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Table(name="cars")
@Entity
@Getter
@Setter
public class Car {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="model_year")
    private int modelYear;

    @Column(name="model_name")
    private String modelName;

    @Column(name="daily_price")
    private double dailyPrice;

    @Column(name="status")
    private String status;

    @ManyToOne
    @JoinColumn(name="brand_id")
    private Brand brandId;
    @ManyToOne
    @JoinColumn(name="color_id")
    private Color colorId;
    @ManyToOne
    @JoinColumn(name="type_id")
    private Type typeId;

    @OneToMany(mappedBy = "carId")
    @JsonIgnore
    private List<Rental> rentals;
}
