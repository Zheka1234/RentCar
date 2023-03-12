package com.miskevich.controller;


import com.miskevich.Service.RoleService;
import com.miskevich.controller.dto.roles.RoleResponse;
import com.miskevich.mapper.RoleMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Roles controller")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/roles")
public class RoleController {

    private final RoleService roleService;

    private final RoleMapper roleMapper;

    @GetMapping
    public ResponseEntity<Object> findAllRoles(@ParameterObject Pageable page) {
        Page<RoleResponse> roleResponseList = roleService.findAll(page).map(roleMapper::toRoleResponse);
        return new ResponseEntity<>(roleResponseList, HttpStatus.OK);
    }
}