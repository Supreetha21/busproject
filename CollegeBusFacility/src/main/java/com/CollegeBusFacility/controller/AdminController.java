package com.CollegeBusFacility.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CollegeBusFacility.service.AdminService;
import com.CollegeBusFacility.serviceimpl.AdminServiceImpl;
import com.CollegeBusFacility.model.Bus;
import com.CollegeBusFacility.model.Payment;
import com.CollegeBusFacility.model.Register;
import com.CollegeBusFacility.model.User;



@Controller

public class AdminController {
	@Autowired
	AdminServiceImpl ad;

	
@GetMapping("addbusroute")
public String showaddbus(){
	return "addbus";
	
}
@PostMapping("addbusroute")
public String addnewbus(@RequestParam int busnum,@RequestParam String routenum,@RequestParam String drivername,
        @RequestParam String driverphonenum,@RequestParam String destination,@RequestParam String stoppings,@RequestParam String fee,
        Model m) {
    Bus bus= new Bus(busnum,routenum,drivername,driverphonenum,destination,stoppings,fee);
     String res = ad.Addbus(bus);
    m.addAttribute("msg",res);
    return "addbus";
	}
@GetMapping(value="addnewuser")
public String showaddnewuser() {
	return "addnewuser";}

@PostMapping("addnewuser")
public String addnewuser(@RequestParam Integer id,@RequestParam String name,@RequestParam String dob,@RequestParam String department,
        @RequestParam String phonenum,@RequestParam String address,@RequestParam String role,@RequestParam String password,
        Model m) {
    User user= new User(id,name,dob,department,phonenum,address,role,password);
     String res = ad.Adduser(user);
    m.addAttribute("msg",res);
    return "addnewuser";
	}
   
  @GetMapping("viewuserdetails")
public String showuser(Model m)
{
	List<User> flist = ad.showuser();
	m.addAttribute("flist", flist);
	return "viewuser";

}

@GetMapping("viewpayment")
public String showpaymentPage(Model m) {
	List<Payment> flist = ad.showcomplete();
	m.addAttribute("flist", flist);
	return "viewpayment1";
	
}








   
}
