package com.eoned.eonedmalll.eonedmall.utils;

import android.util.Log;

/**
 * Created by Administrator on 2018/2/24.
 */

public class LogUtils {

    private static boolean isDebug = true;

    public static void LogDubug(String tag,String msg){
        if (!isDebug){
            return;
        }
        Log.d(tag,msg);
    }
}
