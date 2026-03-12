package com.cesde.cityscooterapp.domain;

import java.time.LocalDate;

public class Pago {

    private int id;
    private int contratoId;
    private double monto;
    private LocalDate fechaPago;

    public Pago() {
    }

    public Pago(int id, int contratoId, double monto, LocalDate fechaPago) {
        this.id = id;
        this.contratoId = contratoId;
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getContratoId() { return contratoId; }
    public void setContratoId(int contratoId) { this.contratoId = contratoId; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public LocalDate getFechaPago() { return fechaPago; }
    public void setFechaPago(LocalDate fechaPago) { this.fechaPago = fechaPago; }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", contratoId=" + contratoId +
                ", monto=" + monto +
                ", fechaPago=" + fechaPago +
                '}';
    }
}
