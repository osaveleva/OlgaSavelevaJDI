package base.jdi.hw1.entities;

import base.jdi.enums.*;
import com.epam.jdi.tools.DataClass;

import java.util.ArrayList;

public class MetalsColors extends DataClass<MetalsColors> {
    public String odd;
    public String even;
    public String natureElementsCheckList;
    public ColorsList colors;
    public Metals metals;
    // TODO Should be List<ENUM>
    public String vegetables;

    public ArrayList<String> asSiteLog() {
        return new ArrayList<String>() {{
            add(String.format("Summary: %s", odd + even));
            // TODO For the reset of the fields.
        }};
    }

    public int getOdd() {
        return 0;
    }
}