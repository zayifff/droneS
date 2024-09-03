package com.droneS.Entity;

import lombok.Getter;
import lombok.Setter;

public class Waypoints {

	
	@Getter @Setter double latitude;
	@Getter @Setter double longitude;
	@Getter @Setter double altitude;
	@Getter @Setter Integer sequencenumber;
	
	Waypoints(double latitude,double longitude,double altitude,Integer sequencenumber){
		
		this.altitude=altitude;
		
		this.latitude=latitude;
		
		this.longitude=longitude;
		
		this.sequencenumber = sequencenumber;
	}
}
