package com.eoned.eonedmalll.eonedmall.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.eoned.eonedmalll.eonedmall.utils.LogUtils;

/**
 * Created by Administrator on 2018/2/24.
 */

public class BaseActivity extends AppCompatActivity {

    private String TAG = "baseactivity";
    private String CLASSNAME;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CLASSNAME = getClass().getName();
        LogUtils.LogDubug(TAG,CLASSNAME+" onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.LogDubug(TAG,CLASSNAME+" onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtils.LogDubug(TAG,CLASSNAME+" onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtils.LogDubug(TAG,CLASSNAME+" onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtils.LogDubug(TAG,CLASSNAME+" onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtils.LogDubug(TAG,CLASSNAME+" onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtils.LogDubug(TAG,CLASSNAME+" onDestroy");
    }
}
