package com.miskevich.Service;

import com.miskevich.entity.City;
import com.miskevich.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService{

    private final CityRepository repository;
    @Override
    public Page<City> findAll(Pageable page) {
        return repository.findAll(page);
    }
}
