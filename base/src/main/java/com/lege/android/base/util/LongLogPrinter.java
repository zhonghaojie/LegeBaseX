package com.lege.android.base.util;

import timber.log.Timber;

/**
 * Description:
 * Created by loctek on 2021/11/24.
 */
public class LongLogPrinter {
    /**
     * 最大一次打印长度
     */
    public final static int MAX_LENGTH = 2000;

    /**
     * 日志类型
     */
    public enum Type {
        I, E, D, W
    }

    /**
     * 打印信息日志
     *
     * @param tag 标志
     * @param msg 内容
     */
    public static void i(String tag, String msg) {
        maxPrint(Type.I, tag, msg);
    }

    /**
     * 打印错误日志
     *
     * @param tag 标志
     * @param msg 内容
     */
    public static void e(String tag, String msg) {
        maxPrint(Type.E, tag, msg);
    }

    /**
     * 打印调试日志
     *
     * @param tag 标志
     * @param msg 内容
     */
    public static void d(String tag, String msg) {
        maxPrint(Type.D, tag, msg);
    }

    /**
     * 打印警告日志
     *
     * @param tag 标志
     * @param msg 打印内容
     */
    public static void w(String tag, String msg) {
        maxPrint(Type.W, tag, msg);
    }


    /**
     * 适应最大长度打印
     *
     * @param type 日志类型
     * @param tag  标志
     * @param msg  信息
     */
    private static void maxPrint(Type type, String tag, String msg) {
        if (msg.length() > MAX_LENGTH) {
            int length = MAX_LENGTH + 1;
            String remain = msg;
            int index = 0;
            while (length > MAX_LENGTH) {
                index++;
                typePrint(type, tag + "[" + index + "]", " \n" + remain.substring(0, MAX_LENGTH));
                remain = remain.substring(MAX_LENGTH);
                length = remain.length();
            }
            if (length <= MAX_LENGTH) {
                index++;
                typePrint(type, tag + "[" + index + "]", " \n" + remain);
            }
        } else {
            typePrint(type, tag, msg);
        }
    }

    /**
     * 打印各种类型
     *
     * @param type 日志类型
     * @param tag  标志
     * @param msg  信息
     */
    private static void typePrint(Type type, String tag, String msg) {
        Timber.tag(tag);
        switch (type) {
            case I:
               Timber.i( msg);
                break;
            case E:
               Timber.e( msg);
                break;
            case W:
               Timber.w( msg);
                break;
            case D:
               Timber.d( msg);
                break;
        }
    }
}
