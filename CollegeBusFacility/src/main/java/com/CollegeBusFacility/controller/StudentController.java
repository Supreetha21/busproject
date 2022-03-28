package com.CollegeBusFacility.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CollegeBusFacility.model.Bus;
import com.CollegeBusFacility.model.ChangeBusRoute;
import com.CollegeBusFacility.model.EnrollBusRoute;
import com.CollegeBusFacility.model.User;
import com.CollegeBusFacility.model.ViewProfile;
import com.CollegeBusFacility.service.AdminService;
import com.CollegeBusFacility.service.StudentService;
import com.CollegeBusFacility.serviceimpl.AdminServiceImpl;

@Controller
public class StudentController {

	
	@Autowired
	StudentService la;
	@Autowired
	AdminService cr;
	
   

	@GetMapping("viewprofile")
	public String showuserprofile(Model m){
	User user = la.showuserprofile();
	m.addAttribute("flist",user);
	return "viewprofile";
	}
	
	/*@GetMapping("viewprofile")
	public String showuserprofile(Model m) {
	List<User> CustomersAll = cr.showuserprofile();
	m.addAttribute("flist", CustomersAll);
	return "viewprofile";
	}
	*/
	

	@GetMapping("enrollbusroute")
	public String showenrollbusPage(Model m) {
		List<Bus> flist = la.showbus();
		m.addAttribute("flist", flist);
		return "enrollbusroute";
		}
	
	
	@PostMapping("enrollbusroute")
	public String adddesiredbus(@RequestParam Integer id,@RequestParam String name,@RequestParam int busnum,@RequestParam String routenum,@RequestParam String destination,@RequestParam String stoppings,@RequestParam String fee,
	        Model m) {
	    EnrollBusRoute enroll = new EnrollBusRoute(id,name,busnum,routenum,destination,stoppings,fee);
	     String res = la.Choosebus(enroll);
	    m.addAttribute("msg",res);
	    return "enrollbusroute";
		}
	
	
	@GetMapping("payfee")
	public String showpayfeesPage() {
		
	return "payfee";
	}
	
	@GetMapping("help")
	public String showhelp(){
	return "help";
	}
	
	
	
	@GetMapping("forgetpassword")
	public String showchangepasswordpage(){
	return "changepassword";
	}
	
	@GetMapping("update")
	public String showupdate(){
	return "changepassword";
	}
	
	@GetMapping("cancel")
	public String showcancel(){
	return "studentfachome";
	}
	
	
	
	
	/*@Override
	public boolean Updatepassword(String password) {
	// TODO Auto-generated method stub
	 cust = this.GetCustomerById();
	String sql = "Update Customers set custFName = ?, custLName = ?, emailid = ?, passwoord = ?, gender = ?, dob = ?, mobile = ?, address = ? where custId = ?;";
	try {
	int r = jt.update(sql, custFname, custLname, emailId, password, gender, dob, mobileNo, address, cust.getCustId());
	if(r>=1) {
	return true;
	}
	else {
	return false;
	}
	}
	catch(Exception ex) {
	System.out.println(ex.getMessage());
	}
	return false;
	
	


}*/
}
