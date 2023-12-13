package com.tobeto.a.spring.intro.sevices.dtos.origin.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListOriginResponse {
    private int id;
    private String name;

}
