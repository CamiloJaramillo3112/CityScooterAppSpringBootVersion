package com.cesde.cityscooterapp.controllers;


import com.cesde.cityscooterapp.domain.Driver;
import com.cesde.cityscooterapp.services.DriverService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/driver")
public class DriverController {


    private final DriverService driverService;

    public DriverController( DriverService driverService) {
        this.driverService = driverService;
    }


    @PostMapping("/create")
    Driver createDriver(@RequestBody Driver driver){
        return driverService.createrDriver(driver);
    }


}
