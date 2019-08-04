package com.mapping.service;

import java.util.List;

import com.mapping.entity.VedUser;

public interface VedService {
	
	public VedUser save(String username, String password, String email, List<String> rolo);

}
