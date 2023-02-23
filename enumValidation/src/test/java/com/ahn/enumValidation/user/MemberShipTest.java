package com.ahn.enumValidation.user;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MemberShipTest {

    @ParameterizedTest
    @CsvSource({"BASIC, 베이직", "STANDARD, 스탠다드", "PREMIUM, 프리미엄"})
    void memberTypeTest(MemberShip input, String expect) throws Exception {
        assertThat(input.getValue()).isEqualTo(expect);
    }

}