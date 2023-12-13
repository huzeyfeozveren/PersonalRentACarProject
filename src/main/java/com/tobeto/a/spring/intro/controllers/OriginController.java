package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.entities.Origin;
import com.tobeto.a.spring.intro.repositories.OriginRepository;
import com.tobeto.a.spring.intro.sevices.abstracts.OriginService;
import com.tobeto.a.spring.intro.sevices.dtos.origin.requests.AddOriginRequest;
import com.tobeto.a.spring.intro.sevices.dtos.origin.requests.DeleteOriginRequest;
import com.tobeto.a.spring.intro.sevices.dtos.origin.requests.UpdateOriginRequest;
import com.tobeto.a.spring.intro.sevices.dtos.origin.responses.GetListOriginResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/origins")
public class OriginController {
    private OriginService originService;

    public OriginController(OriginService originService) {
        this.originService = originService;
    }

    @PostMapping
    public void add(@RequestBody AddOriginRequest request) { originService.add(request); }
    @DeleteMapping
    public void delete(@RequestBody DeleteOriginRequest request) { originService.delete(request); }
    @PutMapping
    public void update(@RequestBody UpdateOriginRequest request) { originService.update(request); }
    @GetMapping("dto")
    public List<GetListOriginResponse> getByNameDto(@RequestParam String name){
        return originService.getByNameDto(name);}
}

    /*
    @GetMapping
    private List<Origin> getAll(){
        return originRepository.findAll();
    }
    @GetMapping("{id}")
    private Origin getById(@PathVariable int id){
        return originRepository.findById(id).orElseThrow();
    }

*/
