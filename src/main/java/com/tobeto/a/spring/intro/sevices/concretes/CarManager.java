package com.tobeto.a.spring.intro.sevices.concretes;

import com.tobeto.a.spring.intro.entities.Car;
import com.tobeto.a.spring.intro.repositories.CarRepository;
import com.tobeto.a.spring.intro.sevices.abstracts.CarService;
import com.tobeto.a.spring.intro.sevices.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.intro.sevices.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.intro.sevices.dtos.car.requests.UpdateCarRequest;
import com.tobeto.a.spring.intro.sevices.dtos.car.responses.GetListCarResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarManager implements CarService {
    private CarRepository carRepository;

    public CarManager(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    @Override
    public void add(AddCarRequest request){
        Car car = new Car();
        car.setModelName(request.getModelName());
        car.setModelYear(request.getModelYear());
        carRepository.save(car);
    }
    @Override
    public void delete(DeleteCarRequest request){
        Car carToDelete = carRepository.findById(request.getId()).orElseThrow();
        carRepository.delete(carToDelete);
    }
    @Override
    public void update(UpdateCarRequest request){
        Car carToUpdate = carRepository.findById(request.getId()).orElseThrow();
        carToUpdate.setModelName(request.getModelName());
        carToUpdate.setModelYear(request.getModelYear());
        carRepository.save(carToUpdate);
    }

    @Override
    public List<GetListCarResponse> getByNameDto(String name) {
        return carRepository.findByName(name);
    }
}
