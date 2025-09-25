package com.example.parcial2.servicios;

import com.example.parcial2.Sala;
import com.example.parcial2.dtos.SalaDTO;
import com.example.parcial2.mapas.IMapaSalaDTO;
import com.example.parcial2.repositorio.ISalaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaServicio {

    @Autowired
    private ISalaRepositorio repositorio;

    @Autowired
    private IMapaSalaDTO mapa;

    // Guardar sala
    public SalaDTO guardarSala(Sala datosSala) throws Exception {
        try {
            return mapa.saladto(repositorio.save(datosSala));
        } catch (Exception error) {
            throw new Exception("Error al guardar la sala: " + error.getMessage());
        }
    }



}
