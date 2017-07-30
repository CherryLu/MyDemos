package com.dsfa.mydemos.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import butterknife.ButterKnife;

/**
 * Created by Android on 2017/7/6.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState!=null){
            getSavaData(savedInstanceState);
        }
        ButterKnife.bind(this);
        if (getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }
        setTranslucentStatus();
    }

    /**
     * 状态栏透明只有Android 4.4 以上才支持
     */
    public void setTranslucentStatus() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window window = getWindow();
            WindowManager.LayoutParams layoutParams = window.getAttributes();
            layoutParams.flags |= WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
            window.setAttributes(layoutParams);
        }
    }




    private void getSavaData(Bundle savedInstanceState){

    }

    public abstract int getViewId();
    public abstract void beforeinitView();
    public abstract void intView();
    public abstract void initData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
