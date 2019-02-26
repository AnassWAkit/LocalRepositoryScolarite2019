package com.scolarite.backend.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long roleId;
	private String role;
	
	@ManyToMany(mappedBy="roles", fetch=FetchType.EAGER)
	private List<User> users;
	

	
	
	public Role() {
	}


	public Role(String role) {
		this.role = role;
	}


	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long id) {
		this.roleId = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
	
}
