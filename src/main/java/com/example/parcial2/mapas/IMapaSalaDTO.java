package com.example.parcial2.mapas;

import com.example.parcial2.Sala;
import com.example.parcial2.dtos.SalaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IMapaSalaDTO {
    IMapaSalaDTO INSTANCE = Mappers.getMapper(IMapaSalaDTO.class);

    @Mapping(source = "nombre",target = "nombre")
    @Mapping(source = "capacidad",target = "capacidad")
    @Mapping(source = "tipo",target = "tipo")
    @Mapping(source = "cine",target = "cine")
    SalaDTO saladto(Sala sala);
}
