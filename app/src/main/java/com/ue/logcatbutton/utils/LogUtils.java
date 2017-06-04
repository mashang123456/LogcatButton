package com.ue.logcatbutton.utils;

import android.util.Log;

/**
 * Created by Administrator on 2017/6/4 日志函数封装.
 */

public class LogUtils {
    private static  boolean  ENABLELOG = true;

    public static void v(String tag , String msg){
        if(ENABLELOG){
            Log.v(tag, msg);
        }
    }

    public static void d(String tag , String msg){
        if(ENABLELOG){
            Log.d(tag, msg);
        }
    }

    public static void i(String tag , String msg){
        if(ENABLELOG){
            Log.i(tag, msg);
        }
    }

    public static void w(String tag , String msg){
        if(ENABLELOG){
            Log.w(tag, msg);
        }
    }

    public static void e(String tag , String msg){
        if(ENABLELOG){
            Log.e(tag, msg);
        }
    }

}
