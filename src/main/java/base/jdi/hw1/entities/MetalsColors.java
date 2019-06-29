package base.jdi.hw1.entities;

import base.jdi.enums.*;
import beans.JDIEx8MetalsColors;
import com.epam.jdi.tools.DataClass;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
            add(String.format("Summary: %s", odd + even));
            add(String.format("Elements: %s", StringUtils.join(natureElements, ", ")));
            add(String.format("Color: %s", colors));
            add(String.format("Metal: %s", metals));
            add(String.format("Vegetables: %s", StringUtils.join(vegetables, ", ")));
            // TODO For the reset of the fields.
        }};
    }

    public static ArrayList<String> asSiteLog(JDIEx8MetalsColors jdiEx8MetalsColors) {
        return new ArrayList<String>() {{
            add(String.format("Summary: %s", getOdd(jdiEx8MetalsColors) + getEven(jdiEx8MetalsColors)));
            add(String.format("Elements: %s", StringUtils.join(jdiEx8MetalsColors.elements, ", ")));
            add(String.format("Color: %s", jdiEx8MetalsColors.color));
            add(String.format("Metal: %s", jdiEx8MetalsColors.metals));
            add(String.format("Vegetables: %s", StringUtils.join(jdiEx8MetalsColors.vegetables, ", ")));
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