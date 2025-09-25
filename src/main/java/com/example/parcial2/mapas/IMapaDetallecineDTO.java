package com.example.parcial2.mapas;

import com.example.parcial2.DetalleCine;
import com.example.parcial2.dtos.DetallecineDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IMapaDetallecineDTO {

    IMapaDetallecineDTO INSTANCE = Mappers.getMapper(IMapaDetallecineDTO.class);

    @Mapping(source = "direccion", target = "direccion")
    @Mapping(source = "ciudad", target = "ciudad")
    @Mapping(source = "telefono", target = "telefono")
    @Mapping(source = "cine", target = "cine")
    DetallecineDTO toDTO(DetalleCine detalleCine);
}