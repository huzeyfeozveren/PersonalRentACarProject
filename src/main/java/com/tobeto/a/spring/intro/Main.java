package com.tobeto.a.spring.intro;

import com.tobeto.a.spring.intro.entities.Brand;
import com.tobeto.a.spring.intro.sevices.dtos.brand.responses.GetListBrandResponse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Brand> brands = new ArrayList<>();

       Brand brand1 = new Brand();
       brand1.setId(1);
       brand1.setBrandName("BMW");
       brands.add(brand1);

       Brand brand2 = new Brand();
       brand2.setId(2);
       brand2.setBrandName("Mercedes");
       brands.add(brand2);

       Brand brand3 = new Brand();
       brand3.setId(3);
       brand3.setBrandName("Audi");
       brands.add(brand3);

       brands.forEach( (item) -> {
           System.out.println(item.getBrandName());} );
       brands.forEach( (item) -> System.out.println(item.getId()) );

       List<GetListBrandResponse> result =
               brands.stream().map(brand -> new GetListBrandResponse(brand.getId(), brand.getBrandName())).toList();


       List<Brand> sortedBrands = brands.stream().sorted((b1, b2) -> b1.getBrandName().compareTo((b2.getBrandName()))).toList();
       sortedBrands.forEach(brand -> System.out.println(brand.getBrandName()));

       System.out.println("*******************************");

       List<Brand> sortedBrands2 = brands.stream().sorted( Comparator.comparing(Brand::getBrandName).thenComparing(Brand::getId) ).toList();
       sortedBrands2.forEach(brand -> System.out.println((brand.getBrandName())));

       System.out.println("*******************************");

       List<Brand> filteredBrands = brands.stream().filter((brand) ->  brand.getBrandName().length() > 4 ).toList();
       System.out.println((filteredBrands.size()));

       List<Brand> filteredBrands2 = brands.stream().filter(brand -> {
           int minLength = 2;
           return brand.getId() > minLength && brand.getBrandName().equals(("BMW"));
       }).toList();
       System.out.println(filteredBrands2.size());
    }
}
