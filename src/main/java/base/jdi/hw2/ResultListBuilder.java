package base.jdi.hw2;

import java.util.List;

import static base.jdi.enums.ResultList.*;

public class ResultListBuilder {


    static String summaryResult(List<Integer> oddsEvens) {
        int res = 0;
        for (int i : oddsEvens) {
            res += i;
        }
        return SUMMARY.value + String.valueOf(res);
    }

    public static String nameResult(String value) {
        return NAME.value + value;
    }

    static String elementsResult(List<String> natureElements) {
        StringBuilder str = new StringBuilder(ELEMENTS.value);
        int size = natureElements.size();
        if (size == 1) {
            return ELEMENTS.value + natureElements.get(0);
        } else {
            for(int i = 0; i < size; i++ ){
                str.append(natureElements.get(i));
                if (i != size-1){
                    str.append(", ");
                }
            }
        }
        return str.toString();
    }

    static String colorResult(String value) {
        return COLOR.value + value;
    }

    static String metalsResult(String value) {
        return METAL.value + value;
    }

    static String vegetablesResult(List<String> vegetables) {
        StringBuilder str = new StringBuilder(VEGETABLES.value);
        int size = vegetables.size();
        if (size == 1) {
            return VEGETABLES.value + vegetables.get(0);
        } else {
            for(int i = 0; i < size; i++ ){
                str.append(vegetables.get(i));
                if (i != size-1){
                    str.append(", ");
                }
            }
        }
        return str.toString();
    }

}
