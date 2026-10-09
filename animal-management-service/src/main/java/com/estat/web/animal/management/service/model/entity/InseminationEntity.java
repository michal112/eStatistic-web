package com.estat.web.animal.management.service.model.entity;

import com.estat.web.animal.management.service.configuration.DatabaseConstants;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = DatabaseConstants.TABLE_INSEMINATION)
public class InseminationEntity extends BaseEntity implements Comparable<InseminationEntity> {

    @Column(name = DatabaseConstants.COLUMN_DATE)
    private LocalDate date;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = BullEntity.class)
    @JoinColumn(name = DatabaseConstants.COLUMN_BULL)
    private BullEntity bull;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = CowEntity.class)
    @JoinColumn(name = DatabaseConstants.COLUMN_COW)
    private CowEntity cow;

    @Override
    public int compareTo(InseminationEntity o) {
        return o.getDate().compareTo(getDate());
    }
}
