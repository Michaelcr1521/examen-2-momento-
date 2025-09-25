package com.example.parcial2.mapas;

import com.example.parcial2.Cine;
import com.example.parcial2.dtos.CineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IMapaCineDTO {

    IMapaCineDTO INSTANCE = Mappers.getMapper(IMapaCineDTO.class);

    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "detalle", target = "detalle")
    @Mapping(source = "salas", target = "salas")
    CineDTO cineToCineDTO(Cine cine);
}
