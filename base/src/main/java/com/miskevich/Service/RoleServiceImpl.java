package com.miskevich.Service;

import com.miskevich.entity.Role;
import com.miskevich.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService{

    private final RoleRepository repository;
    @Override
    public Page<Role> findAll(Pageable page) {
        return repository.findAll(page);
    }
}
