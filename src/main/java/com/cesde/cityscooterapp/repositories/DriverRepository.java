package com.cesde.cityscooterapp.repositories;


import com.cesde.cityscooterapp.domain.Driver;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DriverRepository {


    List<Driver> drivers = new ArrayList<>(

            new ArrayList<>()

    );


        public Driver save(Driver driver){
            drivers.add(driver);
            return driver;
        }



}
