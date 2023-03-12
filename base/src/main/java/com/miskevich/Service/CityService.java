package com.miskevich.Service;


import com.miskevich.entity.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface CityService
{

    Page<City> findAll(Pageable page);
}
