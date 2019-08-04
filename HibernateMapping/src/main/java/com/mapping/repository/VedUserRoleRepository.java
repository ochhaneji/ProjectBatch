package com.mapping.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.entity.VedRole;

@Repository
public interface VedUserRoleRepository extends JpaRepository<VedRole, Serializable>{
	
	public VedRole findByName(String role);

}
