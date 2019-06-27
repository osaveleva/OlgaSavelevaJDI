package base.jdi.hw2;

import beans.JDIEx8MetalsColors;

import java.util.ArrayList;
import java.util.List;

import static base.jdi.EpamPageConstants.COMMA;
import static base.jdi.enums.ResultList.*;

public class ResultListBuilder {

    private List<String> lines = new ArrayList<>();

    private JDIEx8MetalsColors resultValues;

    public void setParam(JDIEx8MetalsColors jdiEx8MetalsColors) {
        resultValues = jdiEx8MetalsColors;
    }

    private String summaryResult() {
        int res = 0;
        for (int i : resultValues.summary) {
            res += i;
        }
        return SUMMARY.value + res;
    }

    private String elementsResult() {
        StringBuilder str = new StringBuilder(ELEMENTS.value);
        int size = resultValues.elements.size();
        if (size == 1) {
            return ELEMENTS.value + resultValues.elements.get(0);
        } else {
            for (int i = 0; i < size; i++) {
                str.append(resultValues.elements.get(i));
                if (i != size - 1) {
                    str.append(COMMA);
                }
            }
        }
        return str.toString();
    }

    private String colorResult() {
        return COLOR.value + resultValues.color;
    }

    private String metalsResult() {
        return METAL.value + resultValues.metals;
    }

    private String vegetablesResult() {
        StringBuilder str = new StringBuilder(VEGETABLES.value);
        int size = resultValues.vegetables.size();
        if (size == 1) {
            return VEGETABLES.value + resultValues.vegetables.get(0);
        } else {
            for (int i = 0; i < size; i++) {
                str.append(resultValues.vegetables.get(i));
                if (i != size - 1) {
                    str.append(COMMA);
                }
            }
        }
        return str.toString();
    }

    public List<String> makeList() {
        lines.add(summaryResult());
        lines.add(elementsResult());
        lines.add(colorResult());
        lines.add(metalsResult());
        lines.add(vegetablesResult());
        return lines;
    }
}
