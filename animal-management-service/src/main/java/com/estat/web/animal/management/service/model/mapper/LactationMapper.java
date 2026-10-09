package com.estat.web.animal.management.service.model.mapper;

import com.estat.web.animal.management.service.model.dto.LactationDto;
import com.estat.web.animal.management.service.model.entity.LactationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LactationMapper {

    LactationDto toDto(LactationEntity lactationEntity);
}
