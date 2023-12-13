package com.tobeto.a.spring.intro.sevices.concretes;

import com.tobeto.a.spring.intro.entities.Type;
import com.tobeto.a.spring.intro.repositories.TypeRepository;
import com.tobeto.a.spring.intro.sevices.abstracts.TypeService;
import com.tobeto.a.spring.intro.sevices.dtos.type.requests.AddTypeRequest;
import com.tobeto.a.spring.intro.sevices.dtos.type.requests.DeleteTypeRequest;
import com.tobeto.a.spring.intro.sevices.dtos.type.requests.UpdateTypeRequest;
import com.tobeto.a.spring.intro.sevices.dtos.type.responses.GetListTypeResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeManager implements TypeService {
    private TypeRepository typeRepository;

    public TypeManager(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public void add(AddTypeRequest request) {
        Type type = new Type();
        type.setName(request.getName());
        typeRepository.save(type);


    }

    @Override
    public void delete(DeleteTypeRequest request) {
        Type typeToDelete = typeRepository.findById(request.getId()).orElseThrow();
        typeRepository.delete(typeToDelete);
    }

    @Override
    public void update(UpdateTypeRequest request) {
        Type typeToDelete = typeRepository.findById(request.getId()).orElseThrow();
        typeToDelete.setName(request.getName());
        typeRepository.save(typeToDelete);

    }

    @Override
    public List<GetListTypeResponse> getByNameDto(String name) {
        return typeRepository.findByName(name);
    }
}
