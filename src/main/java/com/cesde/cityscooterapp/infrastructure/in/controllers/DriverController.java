package com.cesde.cityscooterapp.infrastructure.in.controllers;


import com.cesde.cityscooterapp.domain.Driver;
import com.cesde.cityscooterapp.application.inputport.DriverUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/driver")
public class DriverController {


    private final DriverUseCase driverUseCase;

    public DriverController( DriverUseCase driverUseCase) {
        this.driverUseCase = driverUseCase;
    }


    @PostMapping("/create")
    Driver createDriver(@RequestBody Driver driver){
        return driverUseCase.createrDriver(driver);
    }


    @GetMapping("/{id}")
    Driver getDriverById(@PathVariable int id) {
        return driverUseCase.getDriverById(id).orElse(null);

    }


}
