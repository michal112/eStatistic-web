package com.estat.web.animal.management.service.model.dto;

import java.time.LocalDate;
import java.util.Set;

public record CowDto(String id, String name, String number, String book, LocalDate birth,
                     Set<LactationDto> lactations, Set<InseminationDto> inseminations, BullDto father,
                     Set<EventDto> events) {
}
