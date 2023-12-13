package com.tobeto.a.spring.intro.controllers;


import com.tobeto.a.spring.intro.entities.Type;
import com.tobeto.a.spring.intro.repositories.TypeRepository;
import com.tobeto.a.spring.intro.sevices.abstracts.TypeService;
import com.tobeto.a.spring.intro.sevices.dtos.type.requests.AddTypeRequest;
import com.tobeto.a.spring.intro.sevices.dtos.type.requests.DeleteTypeRequest;
import com.tobeto.a.spring.intro.sevices.dtos.type.requests.UpdateTypeRequest;
import com.tobeto.a.spring.intro.sevices.dtos.type.responses.GetListTypeResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/types")
public class TypeController {
    private TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }
    @PostMapping
    public void add(@RequestBody AddTypeRequest request){
        typeService.add(request);
    }
    @DeleteMapping
    public  void  delete(@RequestBody DeleteTypeRequest request) { typeService.delete(request);}
    @PutMapping
    public void update(@RequestBody UpdateTypeRequest request) { typeService.update(request);}
    @GetMapping("dto")
    public List<GetListTypeResponse> getByNameDto(@RequestParam String name){
        return typeService.getByNameDto(name);}
}
    /*
    @GetMapping
    private List<Type> getAll(){
        return typeRepository.findAll();
    }
    @GetMapping("{id}")
    private Type getById(@PathVariable int id){
        return typeRepository.findById(id).orElseThrow();
    }


*/
