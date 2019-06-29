package base.jdi.hw2;

import beans.JDIEx8MetalsColors;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

import static base.jdi.EpamPageConstants.JSON_PATH;

public class ParseJson {

    private static JsonElement parser() throws FileNotFoundException {
        return new JsonParser().parse(new FileReader(JSON_PATH));
    }

    public static Object[] getDataSetsValues() throws FileNotFoundException {
        Type type = new TypeToken<Map<String, JDIEx8MetalsColors>>() {
        }.getType();

        return ((Map<String, String>) new Gson().fromJson(parser().toString().trim(), type))
                .values().toArray(new Object[0]);
    }
}
