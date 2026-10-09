package com.estat.web.animal.management.service.model.repository;

import com.estat.web.animal.management.service.model.entity.InseminationEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface InseminationEntityRepository extends ListCrudRepository<UUID, InseminationEntity> {
}
