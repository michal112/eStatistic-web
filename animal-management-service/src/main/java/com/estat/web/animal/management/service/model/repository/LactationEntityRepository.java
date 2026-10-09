package com.estat.web.animal.management.service.model.repository;

import com.estat.web.animal.management.service.model.entity.LactationEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface LactationEntityRepository extends ListCrudRepository<UUID, LactationEntity> {
}
