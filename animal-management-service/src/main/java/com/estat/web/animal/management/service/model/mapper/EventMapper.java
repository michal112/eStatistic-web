package com.estat.web.animal.management.service.model.mapper;

import com.estat.web.animal.management.service.model.dto.EventDto;
import com.estat.web.animal.management.service.model.entity.EventEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {

    EventDto toDto(EventEntity eventEntity);
}
