package com.tobeto.a.spring.intro.controllers;
import com.tobeto.a.spring.intro.entities.Brand;
import com.tobeto.a.spring.intro.sevices.abstracts.BrandService;
import com.tobeto.a.spring.intro.sevices.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.intro.sevices.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.intro.sevices.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.intro.sevices.dtos.brand.responses.GetListBrandResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
public class BrandsController {
    private BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @PostMapping
    public void add(@RequestBody AddBrandRequest request){
        brandService.add(request);
    }
    @DeleteMapping
    public void delete(@RequestBody DeleteBrandRequest request){brandService.delete(request);
    }
    @PutMapping
    public void update(@RequestBody UpdateBrandRequest request) {brandService.update(request);
    }
    @GetMapping
    public List<Brand> getByName(@RequestParam String name){
        return brandService.getByName(name);}
    /*@GetMapping("{name}")
    pub/lic List<Brand> getByName(@PathVariable String name){
        return brandService.getByName(name);
    }*/
    @GetMapping("dto")
    public List<GetListBrandResponse> getByNameDto(@RequestParam String name){
        return brandService.getByNameDto(name);}
}
/*
    @GetMapping
    public List<Brand> getAll(){
        List<Brand> brands = brandRepository.findAll();
        return brands;
    }

    @GetMapping("{id}")
    public BrandForDetailDto getById(@PathVariable int id){
        Brand brand = brandRepository.findById(id).orElseThrow();
        BrandForDetailDto dto = new BrandForDetailDto();
        dto.setName((brand.getBrandName()));
        return dto;
    }
*/
