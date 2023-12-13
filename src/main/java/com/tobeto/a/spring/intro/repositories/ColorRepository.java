package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Color;
import com.tobeto.a.spring.intro.sevices.dtos.color.responses.GetListColorResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ColorRepository extends JpaRepository <Color,Integer >{
    @Query("Select new com.tobeto.a.spring.intro.sevices.dtos.color.responses.GetListColorResponse(cl.id,cl.name) from Color cl WHERE cl.name= :name")
    List<GetListColorResponse> findByName(String name);
    @Query("Select new com.tobeto.a.spring.intro.sevices.dtos.color.responses.GetListColorResponse(cl) from Color cl")
    List<GetListColorResponse> findByAll();
}
