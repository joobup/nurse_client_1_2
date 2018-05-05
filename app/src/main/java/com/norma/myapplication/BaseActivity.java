package com.norma.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.orhanobut.logger.Logger;

import butterknife.ButterKnife;

/**
 * Created by wujingtao on 2018/5/5.
 */

public abstract class BaseActivity extends AppCompatActivity
{

    //region>>不重复的编写ButterKnife绑定
    @Override
    public void setContentView(int layoutResID)
    {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    public void setContentView(View view)
    {
        super.setContentView(view);
        ButterKnife.bind(this);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params)
    {
        super.setContentView(view, params);
        ButterKnife.bind(this);
    }
    //endregion

    //初始化Activity
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //这个方法在这里被全部重写了，包括它全部的重载
        setContentView(getResLayout());
        //初始化日志工具
        initLogger();
        initActivity();
    }

    //个性化初始工具
    protected abstract void initActivity();

    //初始化日志工具
    private void initLogger()
    {
        Logger.init("logs");
        Logger.t(this.getClass().getName());
    }

    //获得布局文件的id
    public abstract int getResLayout();
}