package com.eoned.eonedmalll.eonedmall.utils;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2018/2/24.
 */
public class NetApplication extends Application {

    private static NetApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application=this;

    }
    /**获取上下文*/
    public static Context getApplication() {
        return application;
    }
}
