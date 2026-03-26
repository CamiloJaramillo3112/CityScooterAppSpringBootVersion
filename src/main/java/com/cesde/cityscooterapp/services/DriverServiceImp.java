package com.cesde.cityscooterapp.services;

import com.cesde.cityscooterapp.domain.Driver;
import com.cesde.cityscooterapp.repositories.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DriverServiceImp implements DriverService {


    private final DriverRepository driverRepository;

    DriverServiceImp(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }


    @Override
    public Driver createrDriver(Driver driver) {

        return driverRepository.save(driver);
    }

    @Override
    public Driver updateDriver(Driver driver) {
        return null;
    }

    @Override
    public Optional<Driver> getDriverById(int id) {
        return Optional.empty();
    }
}
