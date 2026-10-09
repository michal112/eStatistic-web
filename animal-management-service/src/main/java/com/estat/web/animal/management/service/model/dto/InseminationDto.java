package com.estat.web.animal.management.service.model.dto;

import java.time.LocalDate;

public record InseminationDto(String id, LocalDate date, BullDto bull) {
}
