package com.estat.web.animal.management.service.model.repository;

import com.estat.web.animal.management.service.model.entity.CowEntity;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import java.util.UUID;

public interface CowEntityRepository extends ListPagingAndSortingRepository<UUID, CowEntity> {
}
