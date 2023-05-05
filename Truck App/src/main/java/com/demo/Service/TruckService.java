package com.demo.Service;

import java.util.List;

import com.demo.Entities.Truck;

public interface TruckService {
    
    public List<Truck> getAllTrucks();

    public Truck findTruckById(Integer truckId);
    
}
