package com.estat.web.animal.management.service.model.mapper;

import com.estat.web.animal.management.service.model.dto.CowDto;
import com.estat.web.animal.management.service.model.entity.CowEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        LactationMapper.class, InseminationMapper.class, BullMapper.class, EventMapper.class}
)
public interface CowMapper {

    CowDto toDto(CowEntity cowEntity);
}
