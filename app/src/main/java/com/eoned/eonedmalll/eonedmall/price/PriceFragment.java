package com.eoned.eonedmalll.eonedmall.price;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eoned.eonedmalll.eonedmall.R;
import com.eoned.eonedmalll.eonedmall.base.BaseFragment;

/**
 * Created by Administrator on 2018/2/24.
 */

public class PriceFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_price,container,false);
        return view;
    }
}
