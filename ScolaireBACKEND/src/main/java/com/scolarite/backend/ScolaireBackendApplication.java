package com.scolarite.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScolaireBackendApplication implements CommandLineRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(ScolaireBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Role useroles=new Role("ADMIN");
//		Role userroles2=new Role("PROF");
//		Set<Role> roles=new HashSet<>();
//		Set<Role> roles2=new HashSet<>();
//		roles.add(useroles);
//		roles2.add(userroles2);
//		User admin= new User("anas.wakit@gmail.com", "123456", new Date(), "anasswakit.jpg", "anass", "wakit", 061634567);
//		admin.setRoles(roles);
//		userdao.save(admin);
//		
//		User prof= new User("mehdi.chtaini@gmail.com", "123456", new Date(), "mehdichtaini.jpg", "chtaini", "mehdi", 061634567);
//		prof.setRoles(roles2);
//		userdao.save(prof);
	}

	
}
