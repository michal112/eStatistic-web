package com.estat.web.animal.management.service.model.mapper;

import com.estat.web.animal.management.service.model.dto.InseminationDto;
import com.estat.web.animal.management.service.model.entity.BullEntity;
import com.estat.web.animal.management.service.model.entity.InseminationEntity;
import org.apache.commons.lang3.tuple.Pair;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.time.LocalDate;
import java.util.UUID;
import java.util.stream.Stream;

@SpringJUnitConfig(classes = { InseminationMapperImpl.class, BullMapperImpl.class })
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class InseminationMapperTest {

    private static final LocalDate INSEMINATION_DATE = LocalDate.now();
    private static final String INSEMINATION_UUID = "c2a173ab-d6da-4d29-a788-556fa686c71a";
    private static final String BULL_NAME = "MAXIMO RED";
    private static final String BULL_NUMBER = "PL-005038951607";
    private static final String BULL_UUID = "58b524d8-390a-4021-9134-db076d3e87b7";

    @Autowired
    private InseminationMapper inseminationMapper;

    @Autowired
    private BullMapper bullMapper;

    public Stream<Arguments> testToDtoArgs() {
        var inseminationEntity = new InseminationEntity();
        inseminationEntity.setId(UUID.fromString(INSEMINATION_UUID));
        inseminationEntity.setDate(INSEMINATION_DATE);

        var bullEntity = new BullEntity();
        bullEntity.setId(UUID.fromString(BULL_UUID));
        bullEntity.setName(BULL_NAME);
        bullEntity.setNumber(BULL_NUMBER);

        inseminationEntity.setBull(bullEntity);
        bullEntity.getInseminations().add(inseminationEntity);

        var inseminationDto = new InseminationDto(INSEMINATION_UUID,INSEMINATION_DATE, bullMapper.toDto(bullEntity));
        return Stream.of(
                   Arguments.of(
                       Pair.of(inseminationEntity, inseminationDto)
                   )
        );
    }

    @ParameterizedTest
    @MethodSource("testToDtoArgs")
    public void testToDto(Pair<InseminationEntity, InseminationDto> arguments) {
        //given
        var entity = arguments.getLeft();
        var expected = arguments.getRight();
        //when
        var actual = inseminationMapper.toDto(entity);
        //then
        Assertions.assertThat(actual).usingRecursiveComparison()
                .isEqualTo(expected);
    }

}