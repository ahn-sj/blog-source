package com.ahn.enumValidation.user;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class User {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private MemberShip memberShip;


}
