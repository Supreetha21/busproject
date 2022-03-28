package com.CollegeBusFacility.model;

public class EnrollBusRoute {
	
	
	private int id;
	private String name;
	 private int busnum;  
	    private String routenum;  
	    private String destination;  
	    private String stopping;  
	    private String fee;
		public int getBusnum() {
			return busnum;
		}
		public void setBusnum(int busnum) {
			this.busnum = busnum;
		}
		public String getRoutenum() {
			return routenum;
		}
		public void setRoutenum(String routenum) {
			this.routenum = routenum;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getStopping() {
			return stopping;
		}
		public void setStopping(String stopping) {
			this.stopping = stopping;
		}
		
		
		public String getFee() {
			return fee;
		}
		public void setFee(String fee) {
			this.fee = fee;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public EnrollBusRoute(int id, String name, int busnum, String routenum, String destination, String stopping,
				String fee) {
			super();
			this.id = id;
			this.name = name;
			this.busnum = busnum;
			this.routenum = routenum;
			this.destination = destination;
			this.stopping = stopping;
			this.fee = fee;
		}
		public EnrollBusRoute() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	
	
}
