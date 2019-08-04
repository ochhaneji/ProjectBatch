package com.mapping.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.entity.VedUserRoleMap;
@Repository
public interface VedUserRoleMapRepository extends JpaRepository<VedUserRoleMap, Serializable>{

}
