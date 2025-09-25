package com.example.parcial2.ayuda;

public enum Tiposala {
    DOS_D("2D"),
    TRES_D("3D"),
    IMAX("IMAX");

    private final String etiqueta;

    Tiposala(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
}
