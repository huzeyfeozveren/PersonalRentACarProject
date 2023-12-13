package com.tobeto.a.spring.intro.sevices.dtos.color.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListColorResponse {
    private int id;
    private String name;

}
