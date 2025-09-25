package com.example.parcial2.servicios;

import com.example.parcial2.Cine;
import com.example.parcial2.dtos.CineDTO;
import com.example.parcial2.mapas.IMapaCineDTO;
import com.example.parcial2.repositorio.ICineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CineServicio {

    // Llamamos al repositorio y al mapa
    @Autowired
    private ICineRepositorio repositorio;

    @Autowired
    private IMapaCineDTO mapa;

    // Servicio de guardar cine
    public CineDTO guardarCine(Cine datosCine) throws Exception {
        try {
            return mapa.cineToCineDTO(repositorio.save(datosCine));
        } catch (Exception error) {
            throw new Exception("Algo salió mal al guardar el cine: " + error.getMessage());
        }
    }
}
