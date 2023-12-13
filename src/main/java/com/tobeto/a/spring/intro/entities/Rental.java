package com.tobeto.a.spring.intro.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Table(name="rentals")
@Entity
@Getter
@Setter
public class Rental {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    @ManyToOne
    @JoinColumn(name="car_id")
    private Car carId;

    @Column(name="start_date", columnDefinition = "DATE")
    private LocalDateTime startDate;

    @Column(name="end_date", columnDefinition = "DATE")
    private LocalDateTime endDate;

}
