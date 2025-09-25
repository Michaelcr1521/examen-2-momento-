package com.example.parcial2.repositorio;

import com.example.parcial2.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDetallecineRepositorio extends JpaRepository<DetalleCine, Long> {

    // Buscar todos los detalles por ciudad
    List<DetalleCine> findByCiudad(String ciudad);

    // Buscar todos los detalles por teléfono
    List<DetalleCine> findByTelefono(String telefono);


}
