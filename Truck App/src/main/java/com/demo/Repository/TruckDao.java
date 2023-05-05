package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Entities.Truck;

public interface TruckDao extends JpaRepository<Truck,Integer>{
    
}
