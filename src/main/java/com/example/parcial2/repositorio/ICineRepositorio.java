package com.example.parcial2.repositorio;

import com.example.parcial2.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICineRepositorio extends JpaRepository<Cine, Long> {

    // Buscar cines por nombre exacto
    List<Cine> findByNombre(String nombre);

    // Buscar cines en una ciudad específica (a través de DetalleCine)
    List<Cine> findByDetalleCiudad(String ciudad);

}
