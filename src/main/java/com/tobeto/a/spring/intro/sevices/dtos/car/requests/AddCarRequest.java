package com.tobeto.a.spring.intro.sevices.dtos.car.requests;

import lombok.Data;

@Data
public class AddCarRequest {
    private String ModelName;
    private Integer ModelYear;
}
