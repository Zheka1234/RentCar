package com.miskevich.configuration;

import com.miskevich.mapper.CarMapper;
import com.miskevich.mapper.CityMapper;
import com.miskevich.mapper.RoleMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapStructConfig {

    @Bean
    public RoleMapper roleMapper(){

        return Mappers.getMapper(RoleMapper.class);
    }

    @Bean
    public CityMapper cityMapper(){
        return Mappers.getMapper(CityMapper.class);
    }

    @Bean
    public CarMapper carMapper(){
        return Mappers.getMapper(CarMapper.class);
    }
}
