package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Origin;
import com.tobeto.a.spring.intro.sevices.dtos.origin.responses.GetListOriginResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OriginRepository extends JpaRepository <Origin, Integer> {
    @Query("Select new com.tobeto.a.spring.intro.sevices.dtos.origin.responses.GetListOriginResponse(o.id,o.name) from Origin o WHERE o.name= :name")
    List<GetListOriginResponse> findByName(String name);
}
