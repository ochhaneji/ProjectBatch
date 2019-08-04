package com.mapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Configurable;

import com.mapping.entity.VedRole;
import com.mapping.entity.VedUser;

@Entity
@Table(name="ved_userRoleMap")
@Configurable
public class VedUserRoleMap {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vedRoleMapSeq")
	@SequenceGenerator(allocationSize = 1, 
						initialValue = 1, 
						name = "vedRoleMapSeq", 
						sequenceName="vedRoleMapSeq")
    @Column(name = "id")
    private Long id;
	
	@ManyToOne
	private VedUser vedUser;
	@ManyToOne
	private VedRole vedRole;
	
	
	
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public VedUser getVedUser() {
		return vedUser;
	}
	public void setVedUser(VedUser vedUser) {
		this.vedUser = vedUser;
	}
	public VedRole getVedRole() {
		return vedRole;
	}
	public void setVedRole(VedRole vedRole) {
		this.vedRole = vedRole;
	}
	
	
	
	
	
	
	
	
	
}
