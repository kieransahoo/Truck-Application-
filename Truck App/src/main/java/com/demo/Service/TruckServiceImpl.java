package com.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.Entities.Truck;
import com.demo.Repository.TruckDao;

public class TruckServiceImpl implements TruckService{
    
    @Autowired
    private TruckDao truckDao;

    @Override
    public List<Truck> getAllTrucks() {

        // get all truck details;
        return truckDao.findAll();
    }

    @Override
    public Truck findTruckById(Integer truckId) {
        Optional<Truck> optional = truckDao.findById(truckId);
        if(optional.isPresent()){
            return optional.get();
        }else{
            return null;
        }
    }


    

}
