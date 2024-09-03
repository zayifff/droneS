package com.droneS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.droneS.Entity.Drone;

public interface DroneRepository extends JpaRepository<Drone,Integer> {
	

}
