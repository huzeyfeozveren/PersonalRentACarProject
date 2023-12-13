package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Car;
import com.tobeto.a.spring.intro.sevices.dtos.car.responses.GetListCarResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository <Car, Integer > {
    @Query("Select new com.tobeto.a.spring.intro.sevices.dtos.car.responses.GetListCarResponse(c.id,c.modelName) from Car c WHERE c.modelName= :name")
    List<GetListCarResponse> findByName(String name);
}
