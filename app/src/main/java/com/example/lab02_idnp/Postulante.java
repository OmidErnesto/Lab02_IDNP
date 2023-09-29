package com.example.lab02_idnp;

public class Postulante {
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private String fechaNacimiento;
    private String colegio;
    private String carrera;

    // Constructor
    public Postulante(String apellidoPaterno, String apellidoMaterno, String nombres, String fechaNacimiento, String colegio, String carrera) {
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.colegio = colegio;
        this.carrera = carrera;
    }

    // Getters
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getColegio() {
        return colegio;
    }

    public String getCarrera() {
        return carrera;
    }
}