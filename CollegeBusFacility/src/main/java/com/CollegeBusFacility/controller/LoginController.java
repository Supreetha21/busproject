package com.CollegeBusFacility.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.CollegeBusFacility.model.User;
import com.CollegeBusFacility.service.LoginService;



@Controller
public class LoginController {
	@Autowired
	LoginService lr;
	
	
	
	@GetMapping(value="mlogin")
	public String showLoginPage(){
		return "login";
	}
	@GetMapping(value="adminlogin")
	public String showAdminLoginPage() {
		return "adminlogin";
	}
	@GetMapping(value="studentfaclogin")
	public String showstudentPage(){
		return "studentfaclogin";
	}
	
	@PostMapping("adminlogin")
	public String loginProcess(@RequestParam String userid,@RequestParam String password,Model m)
	{
		try {
		if(userid.equals("smmadmin")&&password.equals("smmadmin"))
		{
			return "adminhome";
		}
		else
			m.addAttribute("msg","Userid or password is incorrect");
		    return "adminlogin";
		}
		catch(Exception e) {
			return "adminlogin";
		}
	}
	
	
	
	
	
	
	
	
	@PostMapping("studentfaclogin")
	public String userLoginProcess(@RequestParam String name,@RequestParam String password,Model m)
	{
		 
			 boolean res = lr.validateUser(name, password);
			 if (res) {
			 User cust = lr.getUserByName(name);
			 
			 m.addAttribute("cust", cust);
			 return "studentfachome";
			 } else {
			 m.addAttribute("msg", "Wrong Username / Password");
			 return "studentfaclogin";
			 }
			 } 
			 
	
	
	@GetMapping("register")
	public String showsregisterPage(){
		return "Register1";
	}
	
	@PostMapping("register")
	public String addregister(@RequestParam Integer id,@RequestParam String name,@RequestParam String dob,@RequestParam String department,
	        @RequestParam String phonenum,@RequestParam String address,@RequestParam String role,@RequestParam String password,
	        Model m) {
	    User user= new User(id,name,dob,department,phonenum,address,role,password);
	     String res = lr.Register(user);
	    m.addAttribute("msg",res);
	    return "addnewuser";
		}
	
	
	
	
	
	

}
