package com.estat.web.animal.management.service.model.mapper;

import com.estat.web.animal.management.service.model.dto.BullDto;
import com.estat.web.animal.management.service.model.entity.BullEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BullMapper {

    BullDto toDto(BullEntity bullEntity);
}
