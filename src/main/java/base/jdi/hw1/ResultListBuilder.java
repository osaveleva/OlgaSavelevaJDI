package base.jdi.hw1;

import base.jdi.enums.Vegetables;


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
        String str = ELEMENTS.value;
        int size = natureElements.length;
        if (size == 1) {
            return ELEMENTS.value + natureElements[0];
        } else {
            for(int i = 0; i < size; i++ ){
                str += natureElements[i];
                if (i != size-1){
                    str += ", ";
                }
            }
        }
        return  str;
    }

    public static String colorResult(String value) {
        return COLOR.value + value;
    }

    public static String metalsResult(String value) {
        return METAL.value + value;
    }

    public static String vegetablesResult(Vegetables... vegetables) {
        String str = VEGETABLES.value;
        int size = vegetables.length;
        if (size == 1) {
            return VEGETABLES.value + vegetables[0].toString();
        } else {
            for(int i = 0; i < size; i++ ){
                str += vegetables[i].toString();
                if (i != size-1){
                    str += ", ";
                }
            }
        }
        return  str;
    }

}
