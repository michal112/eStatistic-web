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
@Table(name = DatabaseConstants.TABLE_LACTATION)
public class LactationEntity extends BaseEntity implements Comparable<LactationEntity> {

    @Column(name = DatabaseConstants.COLUMN_DATE)
    private LocalDate date;

    @Column(name = DatabaseConstants.COLUMN_NUMBER)
    private Integer number;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = CowEntity.class)
    @JoinColumn(name = DatabaseConstants.COLUMN_COW)
    private CowEntity cow;

    @Override
    public int compareTo(LactationEntity o) {
        return o.getDate().compareTo(getDate());
    }
}
