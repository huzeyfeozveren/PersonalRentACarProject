package com.tobeto.a.spring.intro.controllers;

import com.tobeto.a.spring.intro.sevices.abstracts.CarService;
import com.tobeto.a.spring.intro.sevices.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.intro.sevices.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.intro.sevices.dtos.car.requests.UpdateCarRequest;
import com.tobeto.a.spring.intro.sevices.dtos.car.responses.GetListCarResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"api/cars"})
public class CarController {
    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }
    @PostMapping
    public void add(@RequestBody AddCarRequest request){
        carService.add(request);
    }
    @DeleteMapping
    public void delete(@RequestBody DeleteCarRequest request){ carService.delete(request);
    }
    @PutMapping
    public void update(@RequestBody UpdateCarRequest request){ carService.update(request);
    }
    @GetMapping("dto")
    public List<GetListCarResponse> getByNameDto(@RequestParam String name){
        return carService.getByNameDto(name);}
}
    /*

    @GetMapping
    public List<Car> getAll(){

        return carRepository.findAll();
    }
    @GetMapping("{id}")
    public Car getById(@PathVariable int id){
        return carRepository.findById(id).orElseThrow();
    }

    /*
    @PutMapping("{id}")
    public void update(@PathVariable int id, @RequestBody Car car) {
        Car carToUpdate = carRepository.findById(id).orElseThrow();
        carToUpdate.setModelName(car.getModelName());
        carToUpdate.setModelYear(car.getModelYear());
        carToUpdate.setDailyPrice(car.getDailyPrice());
        carToUpdate.setStatus(car.getStatus());
        carToUpdate.setBrandId(car.getBrandId());
        carToUpdate.setColorId(car.getColorId());
        carToUpdate.setTypeId(car.getTypeId());

        carRepository.save(carToUpdate);
    }

*/

