package com.eoned.eonedmalll.eonedmall;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.eoned.eonedmalll.eonedmall.base.BaseActivity;
import com.eoned.eonedmalll.eonedmall.cart.CartFragment;
import com.eoned.eonedmalll.eonedmall.categroy.CategroyFragment;
import com.eoned.eonedmalll.eonedmall.home.HomeFragment;
import com.eoned.eonedmalll.eonedmall.me.MeFragment;
import com.eoned.eonedmalll.eonedmall.price.PriceFragment;
import com.eoned.eonedmalll.eonedmall.views.MainButtomBtn;

/**
 * Created by Administrator on 2018/2/24.
 */

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtomBtn();
        initFragment();
        initFirstPage();
    }


    /*初始化第一个页面*/
    private void initFirstPage() {
        switchFragment(HomeFragment).commit();
        switButtonShape(0);
    }

    /*初始化fragment*/
    private Fragment HomeFragment;
    private Fragment CategroyFragment;
    private Fragment CartFragment;
    private Fragment PriceFragment;
    private Fragment MeFragment;

    private void initFragment() {
        HomeFragment = new HomeFragment();
        CategroyFragment = new CategroyFragment();
        CartFragment = new CartFragment();
        PriceFragment = new PriceFragment();
        MeFragment = new MeFragment();
    }


    /*初始化底部按钮*/
    private MainButtomBtn btnHome;
    private MainButtomBtn btnCategory;
    private MainButtomBtn btnCart;
    private MainButtomBtn btnPrice;
    private MainButtomBtn btnMe;

    private void initButtomBtn() {
        btnHome = findViewById(R.id.btn_home);
        btnCategory = findViewById(R.id.btn_category);
        btnCart = findViewById(R.id.btn_cart);
        btnPrice = findViewById(R.id.btn_price);
        btnMe = findViewById(R.id.btn_me);

        btnHome.setIvAndTv(R.mipmap.home, getResources().getString(R.string.bom_btn_home));
        btnCategory.setIvAndTv(R.mipmap.category, getResources().getString(R.string.bom_btn_category));
        btnCart.setIvAndTv(R.mipmap.quotes, getResources().getString(R.string.bom_btn_cart));
        btnPrice.setIvAndTv(R.mipmap.purchasing, getResources().getString(R.string.bom_btn_price));
        btnMe.setIvAndTv(R.mipmap.mine, getResources().getString(R.string.bom_btn_me));

        btnHome.setOnClickListener(this);
        btnCategory.setOnClickListener(this);
        btnCart.setOnClickListener(this);
        btnPrice.setOnClickListener(this);
        btnMe.setOnClickListener(this);
    }

    /*
    * 切换页面
    * */
    private Fragment currentFragment;

    private FragmentTransaction switchFragment(Fragment targetFragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (!targetFragment.isAdded()) {
            //第一次使用switchFragment()时currentFragment为null，所以要判断一下
            if (currentFragment != null) {
                transaction.hide(currentFragment);
            }
            transaction.add(R.id.fl_fragment, targetFragment, targetFragment.getClass().getName());
        } else {
            transaction.hide(currentFragment).show(targetFragment);
        }
        currentFragment = targetFragment;
        return transaction;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_home:
                switchFragment(HomeFragment).commit();
                switButtonShape(0);
                break;
            case R.id.btn_category:
                switchFragment(CategroyFragment).commit();
                switButtonShape(1);
                break;
            case R.id.btn_cart:
                switchFragment(CartFragment).commit();
                switButtonShape(2);
                break;
            case R.id.btn_price:
                switchFragment(PriceFragment).commit();
                switButtonShape(3);
                break;
            case R.id.btn_me:
                switchFragment(MeFragment).commit();
                switButtonShape(4);
                break;
        }
    }

    /**
     * 切换底部按钮外观
     */

    private void switButtonShape(int pos) {
        btnHome.setTvColor(getResources().getColor(R.color.font87));
        btnCategory.setTvColor(getResources().getColor(R.color.font87));
        btnCart.setTvColor(getResources().getColor(R.color.font87));
        btnPrice.setTvColor(getResources().getColor(R.color.font87));
        btnMe.setTvColor(getResources().getColor(R.color.font87));
        btnHome.setIv(R.mipmap.home);
        btnCategory.setIv(R.mipmap.category);
        btnCart.setIv(R.mipmap.quotes);
        btnPrice.setIv(R.mipmap.purchasing);
        btnMe.setIv(R.mipmap.mine);
        switch (pos) {
            case 0:
                btnHome.setTvColor(getResources().getColor(R.color.orange));
                btnHome.setIv(R.mipmap.home_a);
                break;
            case 1:
                btnCategory.setTvColor(getResources().getColor(R.color.orange));
                btnCategory.setIv(R.mipmap.category_a);
                break;
            case 2:
                btnCart.setTvColor(getResources().getColor(R.color.orange));
                btnCart.setIv(R.mipmap.quotes_a);
                break;
            case 3:
                btnPrice.setTvColor(getResources().getColor(R.color.orange));
                btnPrice.setIv(R.mipmap.purchasing_a);
                break;
            case 4:
                btnMe.setTvColor(getResources().getColor(R.color.orange));
                btnMe.setIv(R.mipmap.mine_a);
                break;
        }
    }
}
