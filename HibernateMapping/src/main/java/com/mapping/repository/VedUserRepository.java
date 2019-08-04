package com.mapping.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.entity.VedUser;

@Repository
public interface VedUserRepository extends JpaRepository<VedUser, Serializable>{

}
