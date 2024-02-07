package com.zeta.zetacarsselling.controller;

import com.zeta.zetacarsselling.model.Vehicle;
import com.zeta.zetacarsselling.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/vehicle")
public class VehicleController {
    private VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/findOne/{vehicleId}")
    public Optional<Vehicle> findOne(@PathVariable int vehicleId){
        return vehicleService.findOne(vehicleId);
    }

    @GetMapping("/findAll")
    public List<Vehicle> findAll(){
        return vehicleService.findALl();
    }

    @PostMapping("/post")
    public void add(@RequestBody Vehicle vehicle){
        vehicleService.save(vehicle);
    }

    @PutMapping("/update")
    public void update(@RequestBody Vehicle vehicle){
        vehicleService.save(vehicle);
    }

    @DeleteMapping("/delete/{vehicleId}")
    public void delete(@PathVariable int vehicleId){
        vehicleService.delete(vehicleId);
    }

    @GetMapping("/findByAnything/{query}")
    public List<Vehicle> findByAnything(@PathVariable String query){
        return vehicleService.findByAnything(query);
    }

    @GetMapping("/sort/{attribute}")
    public List<Vehicle> sort(@PathVariable String attribute){
        Sort sort = Sort.by(attribute);
        return vehicleService.sort(sort);
    }

    @GetMapping("/sortByPriceDesc")
    public List<Vehicle> sortByPriceDesc(){
        return vehicleService.sortByPriceDesc();
    }
}
