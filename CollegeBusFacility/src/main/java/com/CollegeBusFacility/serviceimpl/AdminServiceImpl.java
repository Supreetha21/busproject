package com.CollegeBusFacility.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.CollegeBusFacility.service.AdminService;

import com.CollegeBusFacility.model.Bus;
import com.CollegeBusFacility.model.Payment;
import com.CollegeBusFacility.model.Register;
import com.CollegeBusFacility.model.User;

import com.CollegeBusFacility.model.Bus;
import com.CollegeBusFacility.model.Register;
import com.CollegeBusFacility.model.User;
import com.CollegeBusFacility.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	JdbcTemplate jt ;
	
	@Override
	public String Addbus(Bus bus) {
		
		String str= "Insert into addbusroute(busnum, routenum, drivername, driverphonenum, destination, stoppings, fee) values(?,?,?,?,?,?,?)";
	   
	    try
		{
	    	int  r= jt.update(str, new Object[] {bus.getBusnum(), bus.getRoutenum(), bus.getDrivername(),bus.getDriverphonenum(),bus.getDestination(),bus.getStoppings(),bus.getFee()});
			if(r>=1)
			{
				return "bus route added";
			}
			else
		       return "bus route not added";
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	return "bus route not added";
	}

	

	@Override
	public List<User> showuser() {
		

	String sql = "Select * from viewuser1;";
			try {
				List<User> UserAll = jt.query(sql, new BeanPropertyRowMapper(User.class));
				return UserAll;
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			return null;
			}

	
    @Override
	public String Adduser(User user) {
		String str= "Insert into viewuser1(id,name,dob,department,phonenum,address,password,role) values(?,?,?,?,?,?,?,?)";
		   
	    try
		{
	    	int  r= jt.update(str, new Object[] {user.getId(), user.getName(), user.getDob(),user.getDepartment(),user.getPhonenum(),user.getAddress(),user.getPassword(),user.getRole()});
			if(r>=1)
			{
				return "user added";
			}
			else
		       return "user not added" ;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "user not added";
		
	
	}


     @Override
	public List<Payment> showcomplete() {

		String sql = "select v.id,v.NAME,v.DOB,v.department,v.phonenum,v.address,v.password,v.role,e.busnum,e.routenum,e.destination,e.stoppings,e.fee from viewuser1 as v inner join enrollbusroute as e on v.id=e.id;";
				try {
					List<Payment> Completepay= jt.query(sql, new BeanPropertyRowMapper(Payment.class));
					return Completepay;
				}
				catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
				
		
		return null;
	}



	
    
    

	

	
	
	
	

	

	
	
	
	/*@Override
	public List<Bus> showaddbus(Bus bs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bus> Showall(Bus bs) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<User> Showuser() {
		String str="Select * from userdetails";
		List<User> listAll=jt.query(str, new BeanPropertyRowMapper(User.class));
		return listAll;}

	@Override
	public String register(Register user) {
		String str= "Insert into userdetails(id, role, name, dob, department, phonenum , address,password) values(?,?,?,?,?,?,?,?)";
		int r= jt.update(str, new Object[] {user.getId(), user.getRole(), user.getName(),user.getDob(),user.getDepartment(),user.getPhonenum(),user.getAddress(),user.getPassword()});
		if(r>=1)
		   return "New User  Added";
		else
			return "Error ...";
	}*/

}
