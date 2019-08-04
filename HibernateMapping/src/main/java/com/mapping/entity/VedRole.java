package com.mapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Configurable;

@Entity
@Table(name = "ved_role")
@Configurable
public class VedRole {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vedRoleSeq")
	@SequenceGenerator(allocationSize = 1, 
						initialValue = 1, 
						name = "vedRoleSeq", 
						sequenceName = "vedRoleSeq")
	@Column(name = "id")
	private Long id;

	private String name;

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

}
