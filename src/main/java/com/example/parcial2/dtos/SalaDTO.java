package com.example.parcial2.dtos;

import com.example.parcial2.Cine;
import com.example.parcial2.ayuda.Tiposala;

public class SalaDTO {
    private String nombre;
    private Integer capacidad;
    private Tiposala tipo;
    private Cine cine;

    public SalaDTO() {
    }

    public SalaDTO(String nombre, Integer capacidad, Tiposala tipo, Cine cine) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.cine = cine;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Tiposala getTipo() {
        return tipo;
    }

    public void setTipo(Tiposala tipo) {
        this.tipo = tipo;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }
}
