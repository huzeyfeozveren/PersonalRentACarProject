package com.tobeto.a.spring.intro.sevices.dtos.type.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListTypeResponse {
    private int id;
    private String name;

}
