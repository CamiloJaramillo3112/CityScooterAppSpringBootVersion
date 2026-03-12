package com.cesde.cityscooterapp.domain;

import java.time.LocalDate;

public class Contrato {

    private int id;
    private int customerId;
    private int scooterId;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Contrato() {
    }

    public Contrato(int id, int customerId, int scooterId, LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
        this.customerId = customerId;
        this.scooterId = scooterId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public int getScooterId() { return scooterId; }
    public void setScooterId(int scooterId) { this.scooterId = scooterId; }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }

    public LocalDate getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDate fechaFin) { this.fechaFin = fechaFin; }

    @Override
    public String toString() {
        return "Contrato{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", scooterId=" + scooterId +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
