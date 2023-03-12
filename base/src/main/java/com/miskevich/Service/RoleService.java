package com.miskevich.Service;

import com.miskevich.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


public interface RoleService {

    Page<Role> findAll(Pageable page);
}
