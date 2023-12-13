package com.tobeto.a.spring.intro.sevices.dtos.car.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCarResponse {
    private int id;
    private String name;

}
