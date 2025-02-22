package com.example.springbootapplication.repository;

import com.example.springbootapplication.entity.Role;
import com.example.springbootapplication.entity.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(ERole name);
}
