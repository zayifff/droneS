package com.droneS.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.droneS.Entity.Drone;
import com.droneS.Entity.Waypoints;
import com.droneS.Repository.DroneRepository;

@Service
public class DroneService {
	
	DroneRepository dronerepository;
	
	DroneService(DroneRepository dronerepository){
		this.dronerepository = dronerepository;
	}
	
	public List<Drone> getAllDrones(){
		return dronerepository.findAll();
	}
	
	public Drone getDronebyID(Integer id) {
		return dronerepository.findById(id).orElse(null);
	}

	public Drone updateDrone(Integer id, Drone updateDrone) {
		Optional<Drone> toUpdate = dronerepository.findById(id);
		if(dronerepository.findById(id).isPresent()) {
			Drone FoundedtoUpdate = toUpdate.get();
			FoundedtoUpdate.setLat(updateDrone.getLat());
			FoundedtoUpdate.setLon(updateDrone.getLon());
			FoundedtoUpdate.setSpeed(updateDrone.getSpeed());
			FoundedtoUpdate.setStatus(updateDrone.getStatus());
			FoundedtoUpdate.setDirection(updateDrone.getDirection());
			FoundedtoUpdate.setBatterylevel(updateDrone.getBatterylevel());
			FoundedtoUpdate.setArmcheck(updateDrone.getArmcheck());
			return FoundedtoUpdate;
		}else
			return null;
	}

	public Drone createNewDrone(Drone newDrone) {
		return dronerepository.save(newDrone);
	}

	public void removeDrone(Integer id) {
		dronerepository.deleteById(id);	
	}
	
	//if drone has waypoints go through them and update drones coordinates each time you arrive
	
	public List<Waypoints> moveWaypointToWaypoint(Integer id){
		Optional<Drone> Drone = dronerepository.findById(id);
		if(dronerepository.findById(id).isPresent()) {
			List<Waypoints> currentWaypoints = Drone.get().getWaypoint();
			while(!currentWaypoints.isEmpty()) {
				currentWaypoints.remove(0);
			}
		}
		
		return null;
	}
 

}
