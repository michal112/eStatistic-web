package com.estat.web.animal.management.service.model.entity;

import com.estat.web.animal.management.service.configuration.DatabaseConstants;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = DatabaseConstants.TABLE_EVENTS)
@Entity
@NoArgsConstructor
@Setter
@Getter
public class EventEntity extends BaseEntity {

    @Column(name = DatabaseConstants.COLUMN_DESC)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = CowEntity.class)
    @JoinColumn(name = DatabaseConstants.COLUMN_COW)
    private CowEntity cow;
}
