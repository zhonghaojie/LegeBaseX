package com.lege.android.base.util;

import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Created by loctek on 2021/11/1.
 */
public class JSON {
    public static <T> T parseObject(String json,Class<T> clz){
        return GsonUtils.fromJson(json,clz);
    }
    public static <T> List<T> parseArray(String json,Class<T> cls){
        Type type = new TypeToken<List<T>>(){}.getType();
        JsonArray array = JsonParser.parseString(json).getAsJsonArray();
        List<T> result = new ArrayList<>();

        for (JsonElement element : array) {
            result.add(GsonUtils.<T>fromJson(element.toString(),cls));
        }

        return result;
    }
    public static String toJSONString(Object object){
        return GsonUtils.toJson(object);
    }

}
