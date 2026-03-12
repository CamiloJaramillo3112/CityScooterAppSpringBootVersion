package com.cesde.cityscooterapp.controllers;

import com.cesde.cityscooterapp.domain.Contrato;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    private List<Contrato> contratos = new ArrayList<>();

    @GetMapping
    public List<Contrato> getAllContratos() {
        return contratos;
    }

    @GetMapping("/{id}")
    public Contrato getContratoById(@PathVariable int id) {
        return contratos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Contrato createContrato(@RequestBody Contrato contrato) {
        contratos.add(contrato);
        return contrato;
    }

    @PutMapping("/{id}")
    public Contrato updateContrato(@PathVariable int id, @RequestBody Contrato updatedContrato) {
        for (Contrato c : contratos) {
            if (c.getId() == id) {
                c.setCustomerId(updatedContrato.getCustomerId());
                c.setScooterId(updatedContrato.getScooterId());
                c.setFechaInicio(updatedContrato.getFechaInicio());
                c.setFechaFin(updatedContrato.getFechaFin());
                return c;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteContrato(@PathVariable int id) {
        contratos.removeIf(c -> c.getId() == id);
        return "Contrato deleted with id: " + id;
    }
}
