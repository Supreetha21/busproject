package com.CollegeBusFacility.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.CollegeBusFacility.model.Bus;
import com.CollegeBusFacility.model.ChangeBusRoute;
import com.CollegeBusFacility.model.EnrollBusRoute;
import com.CollegeBusFacility.model.User;
import com.CollegeBusFacility.model.ViewProfile;
import com.CollegeBusFacility.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	JdbcTemplate jt ;
	private Object name;
	
	
	
	public Object getName() {
		return name;
	}


	public void setName(Object name) {
		this.name = name;
	}


	@Override
	public String Choosebus(EnrollBusRoute enrollbusroute) {
		String str= "Insert into enrollbusroute(id,name,busnum,routenum,destination,stoppings,fee) values(?,?,?,?,?,?,?)";
		   
	    try
		{
	    	int  r= jt.update(str, new Object[] {enrollbusroute.getId(),enrollbusroute.getName(),enrollbusroute.getBusnum(), enrollbusroute.getRoutenum(), enrollbusroute.getDestination
	    			(),enrollbusroute.getStopping(),enrollbusroute.getFee()});
			if(r>=1)
			{
				return "Bus route  enrolled!";
			}
			else
		       return "Bus route not enrolled!" ;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return "Bus route not enrolled!";
		
	
	}


	@Override
	public List<Bus> showbus() {
		String sql = "Select * from addbusroute;";
		try {
			List<Bus> Bususer = jt.query(sql, new BeanPropertyRowMapper(Bus.class));
			return Bususer;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	
		
	
	
	@Override
	public User showuserprofile() {
		String sql = "Select * from viewuser1 where NAME='?';";
		try {
			@SuppressWarnings("deprecation")
			User Bususer = (User) jt.query(sql,new Object[] { this.name}, new BeanPropertyRowMapper(Bus.class));
			return Bususer;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}


	
	
	

}
