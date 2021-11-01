package com.lege.android.base.util;

import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Description:
 * Created by loctek on 2021/11/1.
 */
public class JSON {
    public static <T> T parseObject(String json,Class<T> clz){
        return GsonUtils.fromJson(json,clz);
    }
    public static <T> List<T> parseArray(String json){
        Type type = new TypeToken<List<T>>(){}.getType();
        return GsonUtils.fromJson(json,type);
    }
    public static String toJSONString(Object object){
        return GsonUtils.toJson(object);
    }

}
