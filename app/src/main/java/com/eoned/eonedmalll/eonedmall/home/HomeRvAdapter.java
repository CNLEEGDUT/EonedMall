package com.eoned.eonedmalll.eonedmall.home;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2018/2/25.
 */

public class HomeRvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /**
     * 头布局类型
     */
    private final int HEADER0 = 0;
    private final int HEADER1 = 1;
    private final int HEADER2 = 2;
    private final int HEADER3 = 3;
    private final int HEADER4 = 4;
    private final int HEADER5 = 5;
    private final int HEADER6 = 6;
    private final int NORMAL = 100;

    /**
     * 头布局view
     */
    private View headView0;
    private View headView1;
    private View headView2;
    private View headView3;
    private View headView4;
    private View headView5;
    private View headView6;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == HEADER0) {
            return new TopBannerHolder(headView0);
        } else if (viewType == HEADER1) {

        } else {

        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);

        switch (viewType) {
            case HEADER0:

                break;
        }
    }

    @Override
    public int getItemCount() {
        return 1;
    }


    /**
     * 根据顺序设定不同的item类型
     */
    @Override
    public int getItemViewType(int position) {
        if (position == 0 && headView0 != null) {
            return HEADER0;
        } else if (position == 1 && headView1 != null) {
            return HEADER1;
        } else if (position == 2 && headView2 != null) {
            return HEADER2;
        } else if (position == 3 && headView3 != null) {
            return HEADER3;
        } else if (position == 4 && headView4 != null) {
            return HEADER4;
        } else if (position == 5 && headView5 != null) {
            return HEADER5;
        } else if (position == 6 && headView6 != null) {
            return HEADER6;
        } else {
            return NORMAL;
        }
    }

    class TopBannerHolder extends RecyclerView.ViewHolder {
        public TopBannerHolder(View itemView) {
            super(itemView);
        }
    }


    public void setHeadView0(View headView0) {
        this.headView0 = headView0;
    }

    public void setHeadView1(View headView1) {
        this.headView1 = headView1;
    }

    public void setHeadView2(View headView2) {
        this.headView2 = headView2;
    }

    public void setHeadView3(View headView3) {
        this.headView3 = headView3;
    }

    public void setHeadView4(View headView4) {
        this.headView4 = headView4;
    }

    public void setHeadView5(View headView5) {
        this.headView5 = headView5;
    }

    public void setHeadView6(View headView6) {
        this.headView6 = headView6;
    }
}
