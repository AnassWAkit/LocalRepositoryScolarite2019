package com.scolarite.backend.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {

	/**
	 * 
	 */
	

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userID;
	
	@Column(unique=true)
	private String email;
	private String password;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String photo;
	private String nom;
	private String prenom;
	private long tel;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="User_Role"
	,joinColumns={
		@JoinColumn(name="USER_EMAIL",referencedColumnName="userID")}
	,inverseJoinColumns= {
		@JoinColumn(name="ROLE_TYPE",referencedColumnName="roleId")}
	)
	@JsonIgnore
	private Set<Role> roles;

	public User() {
	}

	public User(String email, String password, Date dateNaissance, String photo, String nom, String prenom, long tel) {
		this.email = email;
		this.password = password;
		this.dateNaissance = dateNaissance;
		this.photo = photo;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
	}





	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	public long getTel() {
		return tel;
	}


	public void setTel(long tel) {
		this.tel = tel;
	}
	
	
	
	

	
}
