package com.miskevich.Service;

import com.miskevich.entity.Car;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {


    Page<Car> findAll(Pageable page);
}
