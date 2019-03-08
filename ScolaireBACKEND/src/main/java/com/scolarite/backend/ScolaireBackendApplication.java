package com.scolarite.backend;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.scolarite.backend.dao.UserDAO;
import com.scolarite.backend.model.Role;
import com.scolarite.backend.model.User;

@SpringBootApplication
public class ScolaireBackendApplication implements CommandLineRunner{

	@Autowired
	private UserDAO userdao;
	
	public static void main(String[] args) {
		SpringApplication.run(ScolaireBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Role useroles=new Role("ADMIN");
//		Role userroles2=new Role("PROF");
		Set<Role> roles=new HashSet<>();
//		Set<Role> roles2=new HashSet<>();
//		roles.add(1);
//		roles2.add(userroles2);
//		User admin= new User("anas.wakit@gmail.com", "123456", new Date(), "anasswakit.jpg", "anass", "wakit", 061634567);
//		admin.setRoles(roles);
//		userdao.save(admin);
//		
		
//		User prof3= new User("najatrmadi@gmail.com", "123456", new Date(), "najatrmadi.jpg", "rmadi", "najat", 061634567);
//		User prof4= new User("abdouwakit@gmail.com", "123456", new Date(), "abdouwakit.jpg", "wakit", "abdou", 061634567);
//		User prof5= new User("naimarmadi@gmail.com", "123456", new Date(), "naimarmadi.jpg", "rmadi", "naima", 061634567);
//		User prof6= new User("halimarmadi@gmail.com", "123456", new Date(), "halimarmadi.jpg", "rmadi", "halima", 061634567);
//		User prof7= new User("kokooo@gmail.com", "123456", new Date(), "kokooo.jpg", "kookoo", "koko", 061634567);
//		
		
		
		
		System.out.println("Whoo is puuusht !");
	}

	
}
