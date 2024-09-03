package com.droneS.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.droneS.Entity.Drone;
import com.droneS.Service.DroneService;

@RestController
@RequestMapping("/drones")
public class DroneController {
	
	private final DroneService droneservice;
	
	DroneController(DroneService droneservice){
		this.droneservice = droneservice;
	}
	
	@GetMapping("/drones")
	public List<Drone> getAllDrones(){
		return droneservice.getAllDrones();
	}
	
	@GetMapping("/{droneID}")
	public Drone getDronebyID(@PathVariable Integer Id){
		return droneservice.getDronebyID(Id);
	}
	
	@PutMapping("/{droneID}")
	public Drone updateDrone(@PathVariable Integer Id, @RequestBody Drone updateDrone ) {
		return droneservice.updateDrone(Id,updateDrone);
	}
	
	@PostMapping("/drones")
	public Drone putNewDrone(Drone newDrone) {
		return droneservice.createNewDrone(newDrone);
	}
	
	@DeleteMapping("/drones/{droneID}")
	public void deleteDrone(@PathVariable Integer Id) {
		droneservice.removeDrone(Id);
	}


}
