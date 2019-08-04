package com.mapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Configurable;

@Entity
@Table(name="ved_user")
@Configurable
public class VedUser {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vedUserSeq")
	@SequenceGenerator(allocationSize = 1, 
						initialValue = 1, 
						name = "vedUserSeq", 
						sequenceName="vedUserSeq")
    @Column(name = "id")
    private Long id;
	
	private String name;
	
	@Size(max=512)
	private String password;
	
	private String email;
	
	private Boolean userDisable=false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getUserDisable() {
		return userDisable;
	}

	public void setUserDisable(Boolean userDisable) {
		this.userDisable = userDisable;
	}
	
	
	
	

}
