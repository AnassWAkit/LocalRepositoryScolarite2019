package com.scolarite.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scolarite.backend.model.Role;

public interface RoleDAO extends JpaRepository<Role, Long>{

}
