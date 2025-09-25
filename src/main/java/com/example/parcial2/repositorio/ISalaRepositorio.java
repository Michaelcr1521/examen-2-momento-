package com.example.parcial2.repositorio;

import com.example.parcial2.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISalaRepositorio extends JpaRepository<Sala, Long> {

    // Buscar salas por nombre exacto
    List<Sala> findByNombre(String nombre);

    // Buscar salas por tipo (2D, 3D, IMAX)
    List<Sala> findByTipo(String tipo);


    // Buscar salas de un cine específico por el nombre del cine
    List<Sala> findByCineNombre(String nombreCine);
}
