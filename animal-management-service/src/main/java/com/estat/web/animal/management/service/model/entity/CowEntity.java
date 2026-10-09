package com.estat.web.animal.management.service.model.entity;

import com.estat.web.animal.management.service.configuration.DatabaseConstants;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = DatabaseConstants.TABLE_COW)
public class CowEntity extends BaseEntity {

    @Column(name = DatabaseConstants.COLUMN_NAME)
    private String name;

    @Column(name = DatabaseConstants.COLUMN_NUMBER)
    private String number;

    @Enumerated(EnumType.STRING)
    @Column(name = DatabaseConstants.COLUMN_BOOK)
    private Book book;

    @Column(name = DatabaseConstants.COLUMN_BIRTH)
    private LocalDate birth;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = BullEntity.class)
    @JoinColumn(name = DatabaseConstants.COLUMN_FATHER)
    private BullEntity father;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cow", targetEntity = LactationEntity.class)
    private Set<LactationEntity> lactations = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cow", targetEntity = InseminationEntity.class)
    private Set<InseminationEntity> inseminations = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = GroupEntity.class, mappedBy = "cows")
    private Set<GroupEntity> groups = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cow", targetEntity = EventEntity.class)
    private Set<EventEntity> event = new HashSet<>();

    public enum Book {
        MAIN,
        INTRODUCTORY
    }
}
