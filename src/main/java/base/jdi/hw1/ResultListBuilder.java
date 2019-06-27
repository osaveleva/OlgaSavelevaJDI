package base.jdi.hw1;

import base.jdi.enums.Vegetables;
import org.testng.util.Strings;


import static base.jdi.enums.ResultList.*;

public class ResultListBuilder {


    public static String summaryResult(String... oddsEvens) {
        int res = 0;
        for (String i : oddsEvens) {
            res += Integer.valueOf(i);
        }
        return SUMMARY.value + String.valueOf(res);
    }

    public static String nameResult(String value) {
        return NAME.value + value;
    }

    public static String elementsResult(String... natureElements) {
        StringBuilder str = new StringBuilder(ELEMENTS.value);
        String join = Strings.join(",", natureElements);
        int size = natureElements.length;
        if (size == 1) {
            return ELEMENTS.value + natureElements[0];
        } else {
            for (int i = 0; i < size; i++) {
                str.append(natureElements[i]);
                if (i != size - 1) {
                    str.append(", ");
                }
            }
        }
        return str.toString();
    }

    public static String colorResult(String value) {
        return COLOR.value + value;
    }

    public static String metalsResult(String value) {
        return METAL.value + value;
    }

    public static String vegetablesResult(Vegetables... vegetables) {
        StringBuilder str = new StringBuilder(VEGETABLES.value);
        int size = vegetables.length;
        if (size == 1) {
            return VEGETABLES.value + vegetables[0].toString();
        } else {
            for (int i = 0; i < size; i++) {
                str.append(vegetables[i].toString());
                if (i != size - 1) {
                    str.append(", ");
                }
            }
        }
        return str.toString();
    }

}
