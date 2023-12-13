package com.tobeto.a.spring.intro.sevices.dtos.brand.requests;

import lombok.Data;

@Data
public class UpdateBrandRequest {
    private String brandName;
    private Integer id;
}
