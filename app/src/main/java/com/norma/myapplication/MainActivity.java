package com.norma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity
{
    //region>>控件绑定
    @BindView(R.id.btn01)
    Button btn01;

    @BindView(R.id.btn02)
    Button btn02;

    @BindView(R.id.btn03)
    Button btn03;
    //endregion

    @Override
    protected void initActivity()
    {
        //需要初始化的数据放这里
    }

    @Override
    public int getResLayout()
    {
        //绑定当前页面的控件
        return R.layout.activity_main;
    }

    @OnClick(R.id.btn01)
    public void btn01_OnClick()
    {
        Toast.makeText(this,"模块一",Toast.LENGTH_SHORT).show();
    }

}
