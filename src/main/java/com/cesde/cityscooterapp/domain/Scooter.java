package com.cesde.cityscooterapp.domain;

public class Scooter {

    private int id;
    private String modelo;
    private String estado;
    private double kilometraje;

    public Scooter() {
    }

    public Scooter(int id, String modelo, String estado, double kilometraje) {
        this.id = id;
        this.modelo = modelo;
        this.estado = estado;
        this.kilometraje = kilometraje;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getKilometraje() { return kilometraje; }
    public void setKilometraje(double kilometraje) { this.kilometraje = kilometraje; }

    @Override
    public String toString() {
        return "Scooter{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", estado='" + estado + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
