package com.CollegeBusFacility.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.CollegeBusFacility.model.User;
import com.CollegeBusFacility.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	JdbcTemplate jt ;

	@Override
	public boolean validateAdmin(String userid, String password) {
		
		// TODO Auto-generated method stub
		return false;
	}
	
	
	@Override
	public User getUserByName(String name) {
	String sql = "Select * from viewuser1 where NAME = ?;";
	try {
	User usr = (User) jt.queryForObject(sql, new Object[] {name},new BeanPropertyRowMapper(User.class));
	return usr;
	}
	catch(Exception ex) {
	System.out.println(ex.getMessage());
	}
	return null;
	}
	



	
	@Override
	public boolean validateUser(String name, String password) {
	// TODO Auto-generated method stub
	User cus=this.getUserByName(name);
	if(cus == null) {
	return false;
	}
	else {
	if(cus.getPassword().equals(password)) {
	return true;
	}
	else {
	return false;
	}
	}
	
	
	}


	@Override
	public String Register(User user) {
		String str= "Insert into viewuser1(id,name,dob,department,phonenum,address,password,role) values(?,?,?,?,?,?,?,?)";
		   try
		{
	    	int  r= jt.update(str, new Object[] {user.getId(), user.getName(), user.getDob(),user.getDepartment(),user.getPhonenum(),user.getAddress(),user.getPassword(),user.getRole()});
			if(r>=1)
			{
				return "User Registered!";
			}
			else
		       return "User not Registered!" ;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "User not Registered!";
	}


}

