package com.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.entity.VedRole;
import com.mapping.entity.VedUser;
import com.mapping.entity.VedUserRoleMap;
import com.mapping.repository.VedUserRepository;
import com.mapping.repository.VedUserRoleMapRepository;
import com.mapping.repository.VedUserRoleRepository;

@Service
public class VedServiceImpl implements VedService{
	
	@Autowired
	private VedUserRepository vedUserRepo;
	
	@Autowired
	private VedUserRoleRepository vedUserRoleRepo;
	
	@Autowired
	private VedUserRoleMapRepository vedUserRoleMapRepository;
	

	@Override
	public VedUser save(String username, String password, String email, List<String> rolo) {
		
		VedUser vedUser = save(username, password, email);
		
		
		for(String role : rolo) {
			
			VedRole vedRole = vedUserRoleRepo.findByName(role);
			VedUserRoleMap vedUserRoleMap = new VedUserRoleMap();
			vedUserRoleMap.setVedRole(vedRole);
			vedUserRoleMap.setVedUser(vedUser);

			vedUserRoleMapRepository.save(vedUserRoleMap);
		}
		
				
		
		
		
		
		return vedUser;
	}
	
	
	public VedUser save(String userName, String password,String email) {
		VedUser user=new VedUser();
		user.setName(userName);
		user.setPassword(password);
		user.setEmail(email);
		vedUserRepo.save(user);
		return user;
	}

}
