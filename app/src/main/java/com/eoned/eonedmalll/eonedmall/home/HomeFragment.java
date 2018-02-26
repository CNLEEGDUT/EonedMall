package com.eoned.eonedmalll.eonedmall.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.eoned.eonedmalll.eonedmall.R;
import com.eoned.eonedmalll.eonedmall.base.BaseFragment;
import com.eoned.eonedmalll.eonedmall.utils.UIUtils;
import com.eoned.eonedmalll.eonedmall.views.DividerGridItemDecoration;
import com.eoned.eonedmalll.eonedmall.views.HomeMiddleBtn;

import java.util.ArrayList;
import java.util.List;

import cn.bingoogolapple.bgabanner.BGABanner;

/**
 * Created by Administrator on 2018/2/24.
 */

public class HomeFragment extends BaseFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        return view;
    }


    /**
     * 初始化界面
     */
    private RecyclerView mRecyclerView;

    private void initView(View view) {
        if (getContext() == null) {
            return;
        }

        mRecyclerView = view.findViewById(R.id.rv_home);

        HomeRvAdapter mHomeRvAdapter = new HomeRvAdapter();

        initbanner(mHomeRvAdapter);

        initmiddlebtns(mHomeRvAdapter);

        initmiddletitle(mHomeRvAdapter);

        initRv(mHomeRvAdapter);
    }


    /**
     * 初始化中间件标题
     *
     * @param mHomeRvAdapter*/
    private void initmiddletitle(HomeRvAdapter mHomeRvAdapter) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_homefragment_middletitle, null);
        mHomeRvAdapter.setHeadView2(view);
    }


    /**
     * 初始化RecyclerView
     */
    private void initRv(HomeRvAdapter mHomeRvAdapter) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        // 设置布局管理一条数据占用几行，如果是头布局则头布局自己占用一行
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int postion) {
                if (postion == 0) {
                    return 2;
                } else if (postion == 1) {
                    return 2;
                }else if (postion == 2) {
                    return 2;
                } else {
                    return 1;
                }
            }
        });
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setAdapter(mHomeRvAdapter);
        mRecyclerView.addItemDecoration(new DividerGridItemDecoration(getContext()));
    }


    /**
     * 初始化中间按钮
     */
    private void initmiddlebtns(HomeRvAdapter mHomeRvAdapter) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_homefragment_middleview, null);
        HomeMiddleBtn btn0 = view.findViewById(R.id.hmb_0);
        HomeMiddleBtn btn1 = view.findViewById(R.id.hmb_1);
        HomeMiddleBtn btn2 = view.findViewById(R.id.hmb_2);
        HomeMiddleBtn btn3 = view.findViewById(R.id.hmb_3);
        HomeMiddleBtn btn4 = view.findViewById(R.id.hmb_4);
        HomeMiddleBtn btn5 = view.findViewById(R.id.hmb_5);
        HomeMiddleBtn btn6 = view.findViewById(R.id.hmb_6);
        HomeMiddleBtn btn7 = view.findViewById(R.id.hmb_7);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn0.setIvAndTv(R.mipmap.new_year_index_category_b1,getResources().getString(R.string.home_mid_0));
        btn1.setIvAndTv(R.mipmap.new_year_index_category_b2,getResources().getString(R.string.home_mid_0));
        btn2.setIvAndTv(R.mipmap.new_year_index_category_b3,getResources().getString(R.string.home_mid_0));
        btn3.setIvAndTv(R.mipmap.new_year_index_category_b4,getResources().getString(R.string.home_mid_0));
        btn4.setIvAndTv(R.mipmap.new_year_index_category_b5,getResources().getString(R.string.home_mid_0));
        btn5.setIvAndTv(R.mipmap.new_year_index_category_b6,getResources().getString(R.string.home_mid_0));
        btn6.setIvAndTv(R.mipmap.new_year_index_category_b7,getResources().getString(R.string.home_mid_0));
        btn7.setIvAndTv(R.mipmap.new_year_index_category_b8,getResources().getString(R.string.home_mid_0));

        mHomeRvAdapter.setHeadView1(view);
    }


    /**
     * 初始化topbanner
     */
    private void initbanner(HomeRvAdapter mHomeRvAdapter) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_homefragment_topbanner, null);
        BGABanner topBanner = view.findViewById(R.id.fb_home_top);

        List<String> bigPics = new ArrayList<>();
        bigPics.add("http://www.eoned.com/public/upload/special/2018/01-30/59b8a00d1cdb687f09ae2a5021388623.jpg");
        bigPics.add("http://www.eoned.com/public/upload/special/2018/01-30/ceff73a2d03f0fde796f52dfabccfaab.jpg");
        bigPics.add("http://www.eoned.com/public/upload/special/2018/01-30/7906045cd1b1776496a35b41f68c8d80.jpg");
        bigPics.add("http://www.eoned.com/public/upload/special/2018/01-30/32bc268321a65379a27d52b047fb0af6.jpg");
        bigPics.add("http://www.eoned.com/public/upload/special/2018/02-03/1ace7c944eafc909dfc0577e416e3db1.jpg");
        bigPics.add("http://www.eoned.com/public/upload/special/2018/02-03/1ace7c944eafc909dfc0577e416e3db1.jpg");

        topBanner.setAdapter(new BGABanner.Adapter() {
            @Override
            public void fillBannerItem(BGABanner banner, View itemView, @Nullable Object model, int position) {
                Glide.with(UIUtils.getContext())
                        .load(model)
                        .placeholder(R.drawable.testbombtniv)
                        .error(R.drawable.testbombtniv)
                        .centerCrop()
                        .dontAnimate()
                        .into((ImageView) itemView);
            }
        });
        topBanner.setData(bigPics,null);
        mHomeRvAdapter.setHeadView0(view);
    }


}
