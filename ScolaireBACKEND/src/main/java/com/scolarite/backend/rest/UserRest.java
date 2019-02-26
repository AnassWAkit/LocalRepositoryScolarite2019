package com.scolarite.backend.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scolarite.backend.dao.UserDAO;
import com.scolarite.backend.model.User;

@RestController
@CrossOrigin(origins = "*")
public class UserRest {

	@Autowired
	private UserDAO userDAO;
	
	@GetMapping("/getAllUser")
	public List<User> getAllUser(){
		System.out.println("SIZE *** "+userDAO.findAll().size());
		return userDAO.findAll();
	}
	
	@GetMapping("/getAllUser/{id}")
	public Optional<User> getUserID(@PathVariable Long id){
		
		return userDAO.findById(id);
	}
	
	
	@SuppressWarnings("deprecation")
	@GetMapping("/findUserByName")
	public Page<User> getUserbyName(@RequestParam(name="nom",defaultValue="")String nom,
									@RequestParam(name="page",defaultValue="0") int page,
									@RequestParam(name="size",defaultValue="5") int size){
		
		return userDAO.chercherParPage("%"+nom+"%", new PageRequest(page, size));
	}
	
	@PostMapping("/AddUser")
	public User addUser(@RequestBody User user){
		
		return userDAO.save(user);
	}
	
	@PutMapping("/UpdateUser/{id}")
	public User addUser(@PathVariable Long id,@RequestBody User user){
		user.setUserID(id);
		return userDAO.save(user);
	}
	
	@DeleteMapping("/DeleteUser/{id}")
	public boolean deleteUser(@PathVariable Long id){
		 userDAO.deleteById(id);
		 return true;
	}
}
