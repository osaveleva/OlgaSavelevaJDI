package base.jdi.hw1.entities;

import base.jdi.enums.*;
import beans.JDIEx8MetalsColors;
import com.epam.jdi.tools.DataClass;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;


import static base.jdi.EpamPageConstants.COMMA;
import static base.jdi.enums.ResultList.*;

public class MetalsColors extends DataClass<MetalsColors> {
    public int odd;
    public int even;
    public List<NatureElements> natureElements;
    public ColorsList colors;
    public Metals metals;
    // TODO Should be List<ENUM>
    public List<Vegetables> vegetables;

    public ArrayList<String> asSiteLog() {
        return new ArrayList<String>() {{
            add(SUMMARY_BASE.getRecord(String.valueOf(odd + even)));
            add(ELEMENTS_BASE.getRecord(StringUtils.join(natureElements, COMMA)));
            add(COLOR_BASE.getRecord(colors.toString()));
            add(METAL_BASE.getRecord(metals.toString()));
            add(VEGETABLES_BASE.getRecord(StringUtils.join(vegetables, COMMA)));
            // TODO For the reset of the fields.
        }};
    }

    public static ArrayList<String> asSiteLog(JDIEx8MetalsColors jdiEx8MetalsColors) {
        return new ArrayList<String>() {{
            add(SUMMARY_BASE.getRecord(String.valueOf(getOdd(jdiEx8MetalsColors) + getEven(jdiEx8MetalsColors))));
            add(ELEMENTS_BASE.getRecord(StringUtils.join(jdiEx8MetalsColors.elements, COMMA)));
            add(COLOR_BASE.getRecord(jdiEx8MetalsColors.color));
            add(METAL_BASE.getRecord(jdiEx8MetalsColors.metals));
            add(VEGETABLES_BASE.getRecord(StringUtils.join(jdiEx8MetalsColors.vegetables, COMMA)));
            // TODO For the reset of the fields.
        }};
    }


    public static int getOdd(JDIEx8MetalsColors jdiEx8MetalsColors) {
        return jdiEx8MetalsColors.summary.get(0);
    }

    public static int getEven(JDIEx8MetalsColors jdiEx8MetalsColors) {
        return jdiEx8MetalsColors.summary.get(1);
    }
}