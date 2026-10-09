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
@Getter
@Setter
@Table(name = DatabaseConstants.TABLE_GROUP)
public class GroupEntity extends BaseEntity {

    @Column(name = DatabaseConstants.COLUMN_NAME)
    private String name;

    @Column(name = DatabaseConstants.COLUMN_DESC)
    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = DatabaseConstants.TABLE_COW_GROUP,
            joinColumns = @JoinColumn(name = DatabaseConstants.COLUMN_GROUP_ID),
            inverseJoinColumns = @JoinColumn(name = DatabaseConstants.COLUMN_COW_ID))
    private Set<CowEntity> cows = new HashSet<>();
}
