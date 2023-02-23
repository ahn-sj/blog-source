package com.ahn.enumValidation.user;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MemberShip {
    BASIC("베이직"), STANDARD("스탠다드"), PREMIUM("프리미엄");

    private final String value;

    MemberShip(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static MemberShip from(String value) {
        for (MemberShip memberShip : MemberShip.values()) {
            if (memberShip.name().equals(value.trim().toUpperCase())) {
                return memberShip;
            }
        }
        throw new IllegalArgumentException(value + " 는 존재하지 않는 멤버쉽 유형입니다.");
    }
}
