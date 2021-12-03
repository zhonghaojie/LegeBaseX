package com.lege.android.base.retrofit;

import com.blankj.utilcode.util.GsonUtils;

import org.json.JSONObject;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Description:
 * Created by loctek on 2021/12/3.
 */
public class JSONConverterFactory extends Converter.Factory {
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json;charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("utf-8");

    public static JSONConverterFactory create() {
        return new JSONConverterFactory();
    }

    @Override
    public Converter<JSONObject, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return new Converter<JSONObject, RequestBody>() {
            @Override
            public RequestBody convert(JSONObject value) throws IOException {
                return RequestBody.create(MEDIA_TYPE, GsonUtils.toJson(value).getBytes(UTF_8));
            }
        };
    }

    @Override
    public Converter<ResponseBody, JSONObject> responseBodyConverter(final Type type, Annotation[] annotations, Retrofit retrofit) {
        return new Converter<ResponseBody, JSONObject>() {
            @Override
            public JSONObject convert(ResponseBody value) throws IOException {
                return GsonUtils.fromJson(value.string(), type);
            }
        };

    }

}