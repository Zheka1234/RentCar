package com.miskevich.repository;

import com.miskevich.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

//    @Query("select r from Role r inner join r.user u where u.id = :userId")
    List<Role> findRoleByUserId(Integer userid);

    Role findRoleByName(String name);
}
