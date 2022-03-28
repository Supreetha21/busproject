package com.CollegeBusFacility.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.CollegeBusFacility.model.User;


@Component
public interface LoginService {
	public boolean validateAdmin(String userid,String password);
	public boolean validateUser(String username, String password);
	public User getUserByName(String name);
	public String Register(User user);

	

}
