package com.zeta.zetacarsselling.repository;

import com.zeta.zetacarsselling.model.Vehicle;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    List<Vehicle> findVehiclesByIdOrYearOrPriceOrKilometersOrFirstRegistration(int id, int year, double price, int kl, int fr);
    List<Vehicle> findVehiclesByTypeOrColor(String type, String color);

    List<Vehicle> findVehiclesByOrderByPriceDesc();
}
