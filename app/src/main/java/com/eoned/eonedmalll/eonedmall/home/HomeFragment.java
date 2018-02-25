package com.eoned.eonedmalll.eonedmall.home;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eoned.eonedmalll.eonedmall.R;
import com.eoned.eonedmalll.eonedmall.base.BaseFragment;
import com.eoned.eonedmalll.eonedmall.views.DividerGridItemDecoration;
import com.eoned.eonedmalll.eonedmall.views.FlyBanner;

import java.util.ArrayList;
import java.util.List;

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

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        // 设置布局管理一条数据占用几行，如果是头布局则头布局自己占用一行
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int postion) {
                if (postion == 0) {
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
     * 初始化topbanner
     */
    private void initbanner(HomeRvAdapter mHomeRvAdapter) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_home_topbanner, null);
        FlyBanner topBanner = view.findViewById(R.id.fb_home_top);

        List<String> bigPics = new ArrayList<>();
        bigPics.add("https://gd2.alicdn.com/imgextra/i2/380101244/TB2HHzZdNmJ.eBjy0FhXXbBdFXa_!!380101244.jpg");
        bigPics.add("https://gd4.alicdn.com/imgextra/i4/380101244/TB2qUNua4mI.eBjy0FlXXbgkVXa_!!380101244.jpg");
        bigPics.add("https://gd1.alicdn.com/imgextra/i1/380101244/TB2REFwa9qJ.eBjy1zbXXbx8FXa_!!380101244.jpg");
        bigPics.add("https://gd4.alicdn.com/imgextra/i4/380101244/TB2Ye4taZeK.eBjSszgXXczFpXa_!!380101244.jpg");
        bigPics.add("http://ob9thtnhs.bkt.clouddn.com/tuisong/da386d4d7872451ca346ba6e37da17b6.jpg?e=1477544913&token=m2BF8x75sZF4DIfwnxFri5sT51HeuFRmU2Ue0uVf:LWGBH77qhKA_BEcdgUA5u5AebR0=");

        topBanner.setImagesUrl(bigPics);

        mHomeRvAdapter.setHeadView0(view);
    }
}
