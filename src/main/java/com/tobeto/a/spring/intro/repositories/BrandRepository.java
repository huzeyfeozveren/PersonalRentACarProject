package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Brand;
import com.tobeto.a.spring.intro.sevices.dtos.brand.responses.GetListBrandResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer>
{
    // Select * from BRANDS WHERE Name=name
    List<Brand> findByBrandName(String name);
    @Query("Select new com.tobeto.a.spring.intro.sevices.dtos.brand.responses.xxxxxxxxxxxxxxxxxxxxxxxGetListBrandResponse(b.id,b.brandName) from Brand b WHERE b.brandName= :name")
    List<GetListBrandResponse> findByBrandNameStartingWith(String name);
}
