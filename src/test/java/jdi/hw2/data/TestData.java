package jdi.hw2.data;


import base.jdi.hw1.entities.User;

import static base.jdi.enums.UserName.PETER_CHAILOVSKII;


public class TestData {

    public static User PITER_CHAILOVSKII = new User().set(u -> {
        u.name = PETER_CHAILOVSKII.getLogin();
        u.password = PETER_CHAILOVSKII.getPassword();
    } );

}




