package com.lege.legebase;

import android.util.Log;

import com.lege.android.base.util.JSON;

import java.util.List;

/**
 * Description:
 * Created by loctek on 2021/11/1.
 */
class JavaTest {
    public static void test(){
        String person = "{\"age\":12,\"name\":\"张三\"}";
        String str = "[{\"age\":12,\"name\":\"张三\"},{\"age\":13,\"name\":\"李四\"},{\"age\":14,\"name\":\"王五\"}]";
        List<MainActivity.Person> list = JSON.<MainActivity.Person>parseArray(str);
        MainActivity.Person p = JSON.parseObject(person,MainActivity.Person.class);
        Log.d("JSON","");
    }
}
