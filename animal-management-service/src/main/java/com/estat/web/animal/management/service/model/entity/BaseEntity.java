package com.estat.web.animal.management.service.model.entity;

import com.estat.web.animal.management.service.configuration.DatabaseConstants;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = DatabaseConstants.COLUMN_ID)
    private UUID id;

    @CreatedDate
    @Column(name = DatabaseConstants.COLUMN_CREATED_DATE)
    private LocalDate createdDate;

    @LastModifiedDate
    @Column(name = DatabaseConstants.COLUMN_MODIFIED_DATE)
    private LocalDate modifiedDate;
}
