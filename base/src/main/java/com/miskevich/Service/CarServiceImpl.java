package com.miskevich.Service;

import com.miskevich.entity.Car;
import com.miskevich.entity.City;
import com.miskevich.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;


    @Override
    public Page<Car> findAll(Pageable page) {
        return carRepository.findAll(page);
    }
}
