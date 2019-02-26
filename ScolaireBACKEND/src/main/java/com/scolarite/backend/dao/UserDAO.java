package com.scolarite.backend.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.scolarite.backend.model.User;

public interface UserDAO extends JpaRepository<User, Long>{
	
	@Query("select u from User u where u.nom like :x ")
	public Page<User> chercherParPage(@Param("x") String nom,Pageable page);
}
