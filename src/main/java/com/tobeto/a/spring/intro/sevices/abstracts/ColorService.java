package com.tobeto.a.spring.intro.sevices.abstracts;


import com.tobeto.a.spring.intro.sevices.dtos.color.requests.AddColorRequest;
import com.tobeto.a.spring.intro.sevices.dtos.color.requests.DeleteColorRequest;
import com.tobeto.a.spring.intro.sevices.dtos.color.requests.UpdateColorRequest;
import com.tobeto.a.spring.intro.sevices.dtos.color.responses.GetListColorResponse;

import java.util.List;

public interface ColorService {
    void add(AddColorRequest request);
    void delete(DeleteColorRequest request);
    void update(UpdateColorRequest request);
    List<GetListColorResponse> getByNameDto(String name);
    List<GetListColorResponse> getAllDto();
}
