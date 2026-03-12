package com.cesde.cityscooterapp.controllers;

import com.cesde.cityscooterapp.domain.Scooter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/scooters")
public class ScooterController {

    private List<Scooter> scooters = new ArrayList<>();

    @GetMapping
    public List<Scooter> getAllScooters() {
        return scooters;
    }

    @GetMapping("/{id}")
    public Scooter getScooterById(@PathVariable int id) {
        return scooters.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Scooter createScooter(@RequestBody Scooter scooter) {
        scooters.add(scooter);
        return scooter;
    }

    @PutMapping("/{id}")
    public Scooter updateScooter(@PathVariable int id, @RequestBody Scooter updatedScooter) {
        for (Scooter s : scooters) {
            if (s.getId() == id) {
                s.setModelo(updatedScooter.getModelo());
                s.setEstado(updatedScooter.getEstado());
                s.setKilometraje(updatedScooter.getKilometraje());
                return s;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteScooter(@PathVariable int id) {
        scooters.removeIf(s -> s.getId() == id);
        return "Scooter deleted with id: " + id;
    }
}
