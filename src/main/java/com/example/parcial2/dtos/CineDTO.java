package com.example.parcial2.dtos;

import com.example.parcial2.DetalleCine;
import com.example.parcial2.Sala;

import java.util.List;

public class CineDTO {
    private Long id;
    private String nombre;
    private DetalleCine detalle;
    private List<Sala> salas;

    public CineDTO() {
    }

    public CineDTO(Long id, String nombre, DetalleCine detalle, List<Sala> salas) {
        this.id = id;
        this.nombre = nombre;
        this.detalle = detalle;
        this.salas = salas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DetalleCine getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleCine detalle) {
        this.detalle = detalle;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
}
