package com.estat.web.animal.management.service.model.mapper;

import com.estat.web.animal.management.service.model.dto.BullDto;
import com.estat.web.animal.management.service.model.entity.BullEntity;
import org.apache.commons.lang3.tuple.Pair;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.UUID;
import java.util.stream.Stream;

@SpringJUnitConfig(BullMapperImpl.class)
class BullMapperTest {

    private static final String BULL_NAME = "NAME";
    private static final String BULL_NUMBER = "028943209488";
    private static final String BULL_UUID = "73e9f932-df83-4e32-af85-ca5b339b95b7";

    @Autowired
    private BullMapper bullMapper;

    public static Stream<Arguments> testToDtoArgs() {
        var bullEntity = new BullEntity();
        bullEntity.setId(UUID.fromString(BULL_UUID));
        bullEntity.setName(BULL_NAME);
        bullEntity.setNumber(BULL_NUMBER);

        var bullDto = new BullDto(BULL_UUID, BULL_NAME, BULL_NUMBER);
        return Stream.of(
                   Arguments.of(
                           Pair.of(bullEntity, bullDto)
                   )
        );
    }

    @ParameterizedTest
    @MethodSource("testToDtoArgs")
    void testToDto(Pair<BullEntity, BullDto> arguments) {
        //given
        var entity = arguments.getLeft();
        var expected = arguments.getRight();
        //when
        var actual = bullMapper.toDto(entity);
        //then
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}