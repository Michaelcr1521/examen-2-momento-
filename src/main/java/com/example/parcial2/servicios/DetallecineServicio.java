package com.example.parcial2.servicios;

import com.example.parcial2.DetalleCine;
import com.example.parcial2.dtos.DetallecineDTO;
import com.example.parcial2.mapas.IMapaDetallecineDTO;
import com.example.parcial2.repositorio.IDetallecineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DetallecineServicio {

    @Autowired
    private IDetallecineRepositorio repositorio;

    @Autowired
    private IMapaDetallecineDTO mapa;

    // Guardar detalle del cine
    public DetallecineDTO guardarDetalle(DetalleCine detalle) throws Exception {
        try {
            return mapa.toDTO(repositorio.save(detalle));
        } catch (Exception error) {
            throw new Exception("Error al guardar detalle del cine: " + error.getMessage());
        }
    }

}
