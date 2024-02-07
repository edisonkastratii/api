package com.zeta.zetacarsselling.service;

import com.zeta.zetacarsselling.model.Vehicle;
import com.zeta.zetacarsselling.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    private VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Optional<Vehicle> findOne(int id){
        return vehicleRepository.findById(id);
    }

    public List<Vehicle> findALl(){
        return vehicleRepository.findAll();
    }

    public void save(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    public void delete(int id){
        vehicleRepository.deleteById(id);
    }

    public List<Vehicle> findByAnything(String query){
        try{
            int id = Integer.parseInt(query);
            return vehicleRepository.findVehiclesByIdOrYearOrPriceOrKilometersOrFirstRegistration(id,id,id,id,id);
        }catch (Exception e){
            return vehicleRepository.findVehiclesByTypeOrColor(query, query);
        }
    }

    public List<Vehicle> sort(Sort sort){
        return vehicleRepository.findAll(sort);
    }

    public List<Vehicle> sortByPriceDesc(){
        return vehicleRepository.findVehiclesByOrderByPriceDesc();
    }
}
