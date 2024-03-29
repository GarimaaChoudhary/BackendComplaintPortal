package com.complaintportal.complaintportal.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long id;
	 
	 private String firstName;
	 
	 private String lastName;
	 
	 private String email;

	 private String password;
	 
	 
	 
	 private String mobile;
	 
	 @OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	 private List<Address> address=new ArrayList<>();
	
	 @OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	 @JsonIgnore
	 private List<Complaint> complaint=new ArrayList<>();

	 
	
	  
	 public List<Complaint> getComplaint() {
		return complaint;
	}



	public void setComplaint(List<Complaint> complaint) {
		this.complaint = complaint;
	}

	private LocalDateTime createdAt;
	 
	 public User() {
	 }



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}






	public User(Long id, String firstName, String lastName, String email, String password, String mobile,
			List<Address> address, List<Complaint> complaint, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		
		this.mobile = mobile;
		this.address = address;
		this.complaint = complaint;
		this.createdAt = createdAt;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	






	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}
