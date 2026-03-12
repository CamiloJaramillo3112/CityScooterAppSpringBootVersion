package com.cesde.cityscooterapp.controllers;

import com.cesde.cityscooterapp.domain.Pago;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pagos")
public class PagoController {

    private List<Pago> pagos = new ArrayList<>();

    @GetMapping
    public List<Pago> getAllPagos() {
        return pagos;
    }

    @GetMapping("/{id}")
    public Pago getPagoById(@PathVariable int id) {
        return pagos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Pago createPago(@RequestBody Pago pago) {
        pagos.add(pago);
        return pago;
    }

    @PutMapping("/{id}")
    public Pago updatePago(@PathVariable int id, @RequestBody Pago updatedPago) {
        for (Pago p : pagos) {
            if (p.getId() == id) {
                p.setContratoId(updatedPago.getContratoId());
                p.setMonto(updatedPago.getMonto());
                p.setFechaPago(updatedPago.getFechaPago());
                return p;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deletePago(@PathVariable int id) {
        pagos.removeIf(p -> p.getId() == id);
        return "Pago deleted with id: " + id;
    }
}
