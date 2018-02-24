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
import com.eoned.eonedmalll.eonedmall.views.ButtomBtn;


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
    }

    /*初始化fragment*/
    private Fragment HomeFragment;
    private Fragment CategroyFragment;
    private Fragment CartFragment;
    private Fragment MeFragment;
    private void initFragment() {
        HomeFragment = new HomeFragment();
        CategroyFragment = new CategroyFragment();
        CartFragment = new CartFragment();
        MeFragment = new MeFragment();
    }


    /*初始化底部按钮*/
    private ButtomBtn btnHome;
    private ButtomBtn btnCategory;
    private ButtomBtn btnCart;
    private ButtomBtn btnMe;

    private void initButtomBtn() {
        btnHome = findViewById(R.id.btn_home);
        btnCategory = findViewById(R.id.btn_category);
        btnCart = findViewById(R.id.btn_cart);
        btnMe = findViewById(R.id.btn_me);

        btnHome.setIvAndTv(R.drawable.testbombtniv, getResources().getString(R.string.bom_btn_home));
        btnCategory.setIvAndTv(R.drawable.testbombtniv, getResources().getString(R.string.bom_btn_category));
        btnCart.setIvAndTv(R.drawable.testbombtniv, getResources().getString(R.string.bom_btn_cart));
        btnMe.setIvAndTv(R.drawable.testbombtniv, getResources().getString(R.string.bom_btn_me));

        btnHome.setOnClickListener(this);
        btnCategory.setOnClickListener(this);
        btnCart.setOnClickListener(this);
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
                break;
            case R.id.btn_category:
                switchFragment(CategroyFragment).commit();
                break;
            case R.id.btn_cart:
                switchFragment(CartFragment).commit();
                break;
            case R.id.btn_me:
                switchFragment(MeFragment).commit();
                break;
        }
    }
}
