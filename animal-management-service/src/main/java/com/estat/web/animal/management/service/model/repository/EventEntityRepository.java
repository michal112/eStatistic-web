package com.estat.web.animal.management.service.model.repository;

import com.estat.web.animal.management.service.model.entity.EventEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface EventEntityRepository extends ListCrudRepository<UUID, EventEntity> {
}
