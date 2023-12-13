package com.tobeto.a.spring.intro.sevices.concretes;

import com.tobeto.a.spring.intro.entities.Brand;
import com.tobeto.a.spring.intro.repositories.BrandRepository;
import com.tobeto.a.spring.intro.sevices.abstracts.BrandService;
import com.tobeto.a.spring.intro.sevices.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.intro.sevices.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.intro.sevices.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.intro.sevices.dtos.brand.responses.GetListBrandResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }
    @Override
    public void add(AddBrandRequest request) {
        // iş akışı çalıştıktan sonra..
        if (request.getName().length() < 3)
            throw new RuntimeException("Marka ismi 3 haneden küçük olamaz");

        Brand brand = new Brand();
        brand.setBrandName(request.getName());
        brandRepository.save(brand);
    }
    @Override
    public void delete(DeleteBrandRequest request) {
        Brand brandToDelete = brandRepository.findById(request.getId()).orElseThrow();
        brandRepository.delete(brandToDelete);
    }
    @Override
    public void update(UpdateBrandRequest request){
        Brand brandToUpdate = brandRepository.findById(request.getId()).orElseThrow();
        brandToUpdate.setBrandName(request.getBrandName());
        brandRepository.save(brandToUpdate);
    }

    @Override
    public List<Brand> getByName(String name) {
        return brandRepository.findByBrandName(name);
    }

    @Override
    public List<GetListBrandResponse> getByNameDto(String name) {
        /*List<Brand> brands = brandRepository.findByBrandName(name);
        List<GetListBrandResponse> dtos = new ArrayList<>();

        for(Brand brand: brands){
            dtos.add(new GetListBrandResponse(brand.getBrandName()));
        }
        return dtos;
        */

        //Yaklaşım 2: Reposioryde List<GetListBrandResponse> dönebilen yeni bir method oluştumak.

        return brandRepository.findByBrandNameStartingWith(name);
    }

}
