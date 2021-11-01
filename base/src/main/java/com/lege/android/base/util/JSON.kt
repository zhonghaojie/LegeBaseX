package com.lege.android.base.util

import com.blankj.utilcode.util.GsonUtils
import com.google.gson.reflect.TypeToken

/**
 * Description:
 * Created by loctek on 2021/11/1.
 */
inline fun <reified T> String.parseObject(): T = GsonUtils.fromJson(this, T::class.java)
inline fun <reified E> E.toJsonString(): String = GsonUtils.toJson(this,E::class.java)
inline fun <reified E> String.parseArray(): List<E> =
    GsonUtils.fromJson<List<E>>(this, object : TypeToken<List<E>>() {}.type)
