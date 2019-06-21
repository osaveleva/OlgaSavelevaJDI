package base.jdi.hw2;

import beans.JDIEx8MetalsColors;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static base.jdi.hw2.ResultListBuilder.*;

public class ParseJson {
  //  private static List<String> lines = new ArrayList<>();

    private static JsonElement parser() throws FileNotFoundException {
        return new JsonParser().parse(new FileReader("src/test/resources/JDI_ex8_MetalsColors.json"));
    }

    private static JDIEx8MetalsColors getJDIEx8MetalsColors(JsonElement jsonData) {
        return new Gson().fromJson(jsonData.toString().trim(), new TypeToken<JDIEx8MetalsColors>() {
        }.getType());
    }

    private static List<String> getDataSets() throws FileNotFoundException {
        List<String> datasetList = new ArrayList<>();
        // JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/resources/JDI_ex8_MetalsColors.json"));
        JsonElement jsonData = parser();

        JSONObject jsonObject = new JSONObject(jsonData.toString().trim());
        Iterator<String> keys = jsonObject.keys();

        while (keys.hasNext()) {
            String key = keys.next();
            datasetList.add(key);
        }
        return datasetList;
    }

    private static Object[][] convert(List<List<Object>> lists) {
        Object[][] array = new Object[lists.size()][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Object[lists.get(i).size()];
            lists.get(i).toArray(array[i]);
        }
        return array;
    }

    public static Object[][] getDataSetsValues() throws FileNotFoundException {
        List<List<Object>> listData = new ArrayList<>();
        List<String> datasetList;
        JsonElement jsonData = parser();
        datasetList = getDataSets();

        for (String s : datasetList) {
            JDIEx8MetalsColors dataSet = getJDIEx8MetalsColors(jsonData.getAsJsonObject().get(s));
            List<String> lines = new ArrayList<>();
            lines.add(summaryResult(dataSet.summary));
            lines.add(elementsResult(dataSet.elements));
            lines.add(colorResult(dataSet.color));
            lines.add(metalsResult(dataSet.metals));
            lines.add(vegetablesResult(dataSet.vegetables));
            listData.add(Arrays.asList(dataSet.summary, dataSet.metals, dataSet.color, dataSet.vegetables, dataSet.elements, lines));
            //  System.out.println(dataSet);
        }
        convert(listData);

        return convert(listData);

    }
}
