package com.ahn.enumValidation.user;

public class UserRequest {
    private String name;
    private MemberShip memberShip;

    public String getName() {
        return name;
    }

    public MemberShip getMemberShip() {
        return memberShip;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "name='" + name + '\'' +
                ", memberShip=" + memberShip +
                '}';
    }
}
