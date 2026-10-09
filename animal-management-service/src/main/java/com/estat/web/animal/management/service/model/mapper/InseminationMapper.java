package com.estat.web.animal.management.service.model.mapper;

import com.estat.web.animal.management.service.model.dto.InseminationDto;
import com.estat.web.animal.management.service.model.entity.InseminationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = BullMapper.class)
public interface InseminationMapper {

    InseminationDto toDto(InseminationEntity inseminationEntity);
}
