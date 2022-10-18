package com.javapractice.demo.dao;

import com.javapractice.demo.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository <Roles, String> {
}
