package com.miskevich.mapper;

import com.miskevich.controller.dto.roles.RoleResponse;
import com.miskevich.entity.Role;
import org.mapstruct.Mapper;

@Mapper
public interface RoleMapper {

    RoleResponse toRoleResponse(Role role);
}
