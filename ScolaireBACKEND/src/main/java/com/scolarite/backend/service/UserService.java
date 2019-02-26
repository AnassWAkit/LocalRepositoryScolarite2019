package com.scolarite.backend.service;


import java.util.List;

import com.scolarite.backend.model.User;

public interface UserService {

	public List<User> getAllUser();
	public List<User> getUserActif();
	public List<User> getUserInactif();
	
}
