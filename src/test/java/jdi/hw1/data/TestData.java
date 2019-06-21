package jdi.hw1.data;


import base.jdi.hw1.entities.MetalsColors;
import base.jdi.hw1.entities.User;

import java.util.ArrayList;
import java.util.List;

import static base.jdi.EpamPageConstants.COMMA;
import static base.jdi.hw1.ResultListBuilder.*;
import static base.jdi.enums.ColorsList.*;
import static base.jdi.enums.Metals.*;
import static base.jdi.enums.NatureElements.*;
import static base.jdi.enums.OddsEven.*;
import static base.jdi.enums.UserName.PETER_CHAILOVSKII;
import static base.jdi.enums.Vegetables.*;

public class TestData {
    public static List<String> lines = new ArrayList<>();

    public static User PITER_CHAILOVSKII = new User().set(u -> {
        u.name = PETER_CHAILOVSKII.getLogin();
        u.password = PETER_CHAILOVSKII.getPassword();
    } );

    public static MetalsColors METALS_COLORS = new MetalsColors().set(c -> {
        c.odd = THREE.value;
        c.even = EIGHT.value;
        c.natureElementsCheckList = WATER.value+COMMA+FIRE.value;
        c.colors = Red;
        c.metals = Selen;
        c.vegetables = Cucumber+COMMA+Tomato+COMMA+Vegetables;
    } );

    public static List<String> createResultList(){
        lines.add(summaryResult(THREE.value, EIGHT.value));
        lines.add(elementsResult(WATER.value, FIRE.value));
        lines.add(colorResult(Red.toString()));
        lines.add(metalsResult(Selen.toString()));
        lines.add(vegetablesResult(Cucumber, Tomato));
        return lines;
    }
}




