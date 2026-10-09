package com.estat.web.animal.management.service.model.repository;

import com.estat.web.animal.management.service.model.entity.GroupEntity;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import java.util.UUID;

public interface GroupEntityRepository extends ListPagingAndSortingRepository<UUID, GroupEntity> {
}
