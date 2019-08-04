package com.mapping.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.entity.VedUser;
import com.mapping.service.VedService;

@RestController
public class UserRollController {
	
	@Autowired
	private VedService vedService;
	
	@RequestMapping(value = "/createUsers", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String createUserInWorkshopProfile(@RequestBody HashMap<String, Object> jsonIn) {
		String username = (String) jsonIn.get("name");
		String password = (String) jsonIn.get("password");
		String email = (String) jsonIn.get("email");
		List<String> role =  (List<String>) jsonIn.get("role");
			
		
		
		VedUser veduser = vedService.save(username, password, email, role);
		/*if (woekshopid != 0) {
			VedWorkShop workShop = (VedWorkShop) entityManagerUtil.find(VedWorkShop.class, woekshopid);
			userAdminService.saveWorkShopAdmin(veduser, workShop);

			// String result=userAdminService.getUsersInWorkShopProfile(jsonIn);
			JSONObject jsonOut = new JSONObject();
			jsonOut.accumulate("response", "success");

			return jsonOut.toString();
		} else {
			JSONObject jsonOut = new JSONObject();
			jsonOut.accumulate("response", "fail");
			return jsonOut.toString();
		}*/
		return "u r osssmmm man";

	}






}
