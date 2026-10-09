package com.estat.web.animal.management.service.model.entity;

import com.estat.web.animal.management.service.configuration.DatabaseConstants;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = DatabaseConstants.TABLE_BULL)
public class BullEntity extends BaseEntity {

    @Column(name = DatabaseConstants.COLUMN_NAME)
    private String name;

    @Column(name = DatabaseConstants.COLUMN_NUMBER)
    private String number;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "bull", targetEntity = InseminationEntity.class)
    private Set<InseminationEntity> inseminations = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "father", targetEntity = CowEntity.class)
    private Set<CowEntity> children = new HashSet<>();
}
