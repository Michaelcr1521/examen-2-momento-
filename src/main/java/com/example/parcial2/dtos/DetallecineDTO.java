package com.example.parcial2.dtos;

import com.example.parcial2.Cine;

public class DetallecineDTO {
    private String direccion;
    private String ciudad;
    private String telefono;
    private Cine cine;

    public DetallecineDTO() {
    }

    public DetallecineDTO(String direccion, String ciudad, String telefono, Cine cine) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.cine = cine;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }
}
