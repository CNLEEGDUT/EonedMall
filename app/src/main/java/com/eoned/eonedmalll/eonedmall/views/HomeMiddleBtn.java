package com.eoned.eonedmalll.eonedmall.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eoned.eonedmalll.eonedmall.R;
import com.eoned.eonedmalll.eonedmall.utils.UIUtils;


public class HomeMiddleBtn extends LinearLayout {

    private ImageView iv;
    private TextView tv;

    public HomeMiddleBtn(Context context) {
        super(context);
        init(context);
    }
    public HomeMiddleBtn(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public HomeMiddleBtn(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }
    private void init(Context context) {
        setOrientation(VERTICAL);
        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        setLayoutParams(layoutParams);
        setGravity(Gravity.CENTER);
        setPadding(UIUtils.dip2px(5),UIUtils.dip2px(5),UIUtils.dip2px(5),UIUtils.dip2px(5));

        View middleBtnView = LayoutInflater.from(context).inflate(R.layout.view_homefragment_middlebtn, this, true);
        iv = middleBtnView.findViewById(R.id.home_mid_btn_iv);
        tv = middleBtnView.findViewById(R.id.home_mid_btn_tv);
    }

    public void setIvAndTv(int imgRes,String tvString){
        iv.setImageResource(imgRes);
        tv.setText(tvString);
    }

    public void setTvColor(int color){
        tv.setTextColor(color);
    }

}
