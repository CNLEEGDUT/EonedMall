package com.eoned.eonedmalll.eonedmall.base;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.eoned.eonedmalll.eonedmall.utils.LogUtils;

/**
 * Created by Administrator on 2018/2/24.
 */

public class BaseFragment extends Fragment {
    private String TAG = "basefrasgment";
    private String CLASSNAME;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.LogDubug(TAG,CLASSNAME+" onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        LogUtils.LogDubug(TAG,CLASSNAME+" onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        LogUtils.LogDubug(TAG,CLASSNAME+" onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        LogUtils.LogDubug(TAG,CLASSNAME+" onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        LogUtils.LogDubug(TAG,CLASSNAME+" onStop");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        CLASSNAME = getClass().getName();
        LogUtils.LogDubug(TAG,CLASSNAME+" onAttach");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        LogUtils.LogDubug(TAG,CLASSNAME+" onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        LogUtils.LogDubug(TAG,CLASSNAME+" onDetach");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LogUtils.LogDubug(TAG,CLASSNAME+" onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LogUtils.LogDubug(TAG,CLASSNAME+" onActivityCreated");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtils.LogDubug(TAG,CLASSNAME+" onDestroy");
    }


}
