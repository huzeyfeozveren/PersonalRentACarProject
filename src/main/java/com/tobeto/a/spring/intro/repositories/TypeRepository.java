package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Type;
import com.tobeto.a.spring.intro.sevices.dtos.type.responses.GetListTypeResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypeRepository extends JpaRepository<Type, Integer> {
    @Query("Select new com.tobeto.a.spring.intro.sevices.dtos.type.responses.GetListTypeResponse(t.id,t.name) from Type t WHERE t.name= :name")
    List<GetListTypeResponse> findByName(String name);
}
