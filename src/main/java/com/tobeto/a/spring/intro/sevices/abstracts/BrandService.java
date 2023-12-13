package com.tobeto.a.spring.intro.sevices.abstracts;

import com.tobeto.a.spring.intro.entities.Brand;
import com.tobeto.a.spring.intro.sevices.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.intro.sevices.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.intro.sevices.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.intro.sevices.dtos.brand.responses.GetListBrandResponse;

import java.util.List;

public interface BrandService {
    void add(AddBrandRequest request);
    void delete(DeleteBrandRequest request);
    void update(UpdateBrandRequest request);
    List<Brand> getByName(String name);
    List<GetListBrandResponse> getByNameDto(String name);
}
