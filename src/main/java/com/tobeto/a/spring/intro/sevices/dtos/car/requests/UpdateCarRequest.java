package com.tobeto.a.spring.intro.sevices.dtos.car.requests;

import lombok.Data;

@Data
public class UpdateCarRequest {
    private Integer id;
    private String ModelName;
    private Integer ModelYear;
}
