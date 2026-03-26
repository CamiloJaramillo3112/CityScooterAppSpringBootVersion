package com.cesde.cityscooterapp.services;

import com.cesde.cityscooterapp.domain.Driver;

import java.util.Optional;

public interface DriverService {

    Driver createrDriver(Driver driver);
    Driver updateDriver(Driver driver);
    Optional<Driver> getDriverById(int id);
}
