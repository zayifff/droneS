package com.droneS.Entity;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "drone")
@Data

public class Drone {
	
	@Getter @Setter @Id private Integer id;
	@Getter @Setter private float speed;
	@Getter @Setter private double lat;
	@Getter @Setter private double lon;
	@Getter @Setter private String status;
	@Getter @Setter private float direction;
	@Getter @Setter private float batterylevel;
	@Getter @Setter private Boolean armcheck;
	@Getter @Setter private List<Waypoints> waypoint;
	
	public Drone(Integer id, float speed,double lat,double lon, String status,float direction,float batterylevel,Boolean armcheck){
		this.id = id;
		this.speed = speed;
		this.lat=lat;
		this.lon = lon;
		this.status=status;
		this.direction=direction;
		this.batterylevel=batterylevel;
		this.armcheck = false;
	}
	
	public Drone(Integer id) {
		this.id=id;
		this.speed = 20;
		this.lat=10;
		this.lon=10;
		this.status = "ARMED";
		this.direction = 180;
		this.batterylevel  = 100;
		this.armcheck = false;	
	}
	
	public Drone() {
		this.id = 1;
		this.speed = 20;
		this.lat=10;
		this.lon=10;
		this.status = "ARMED";
		this.direction = 180;
		this.batterylevel  = 100;
		this.armcheck = false;
	}
	

}
