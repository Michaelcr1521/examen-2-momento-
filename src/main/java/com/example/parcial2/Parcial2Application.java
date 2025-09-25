package com.example.parcial2;

import com.example.parcial2.Cine;
import com.example.parcial2.DetalleCine;
import com.example.parcial2.Sala;
import com.example.parcial2.ayuda.Tiposala;
import com.example.parcial2.repositorio.ICineRepositorio;
import com.example.parcial2.repositorio.ISalaRepositorio;
import com.example.parcial2.repositorio.IDetallecineRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Parcial2Application {

	public static void main(String[] args) {
		SpringApplication.run(Parcial2Application.class, args);
	}

	@Bean
	CommandLineRunner initData(ICineRepositorio cineRepositorio,
							   ISalaRepositorio salaRepositorio,
							   IDetallecineRepositorio detalleRepositorio) {
		return args -> {
			// Crear el cine
			Cine procinal = new Cine();
			procinal.setNombre("Cinemax");
			procinal = cineRepositorio.save(procinal);

			// Crear el detalle del cine
			DetalleCine detalle = new DetalleCine();
			detalle.setDireccion("Calle 13");
			detalle.setCiudad("Medellín");
			detalle.setTelefono("555-1234");
			detalle.setCine(procinal);
			detalleRepositorio.save(detalle);

			// Crear la sala y asociarla al cine
			Sala salaTRES_D = new Sala();
			salaTRES_D.setNombre("TRES_D");
			salaTRES_D.setCapacidad(100);
			salaTRES_D.setTipo(Tiposala.DOS_D); // enum
			salaTRES_D.setCine(procinal);
			salaRepositorio.save(salaTRES_D);

			System.out.println("Cine, detalle y sala inicializados correctamente.");
		};
	}
}
