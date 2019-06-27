package base.jdi.hw1.entities;

import base.jdi.enums.*;
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

    public int getOdd() {
        return 0;
    }
}