package com.CollegeBusFacility.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CollegeBusFacility.model.Bus;
import com.CollegeBusFacility.model.ChangeBusRoute;
import com.CollegeBusFacility.model.EnrollBusRoute;
import com.CollegeBusFacility.model.User;
import com.CollegeBusFacility.model.ViewProfile;

@Service
public interface StudentService {

	public String Choosebus(EnrollBusRoute enrollbusroute);

	public List<Bus> showbus();

  
	

	 

	

	

	public User showuserprofile();
	

}
