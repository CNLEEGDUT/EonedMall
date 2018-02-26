package com.eoned.eonedmalll.eonedmall;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.eoned.eonedmalll.eonedmall.utils.UIUtils;

public class Main2Activity extends AppCompatActivity {

    ListView listView;
    Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.lv_test);
        listView.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 10;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                View cusview = LayoutInflater.from(Main2Activity.this).inflate(R.layout.view_test,viewGroup,false);
                TextView textView = cusview.findViewById(R.id.tv_test);
                textView.setText(i+"");
                return cusview;
            }
        });

        final int[] i = {0};
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                listView.smoothScrollToPositionFromTop(i[0]++,0,500);
                if (i[0]==7){
                    listView.setSelection(0);
                    i[0] = 0;
                }
                handler.postDelayed(this,1000);
            }
        },1);
    }
}
