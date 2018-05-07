package com.norma.myapplication;

import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity
{
    //region>>控件绑定
    @BindView(R.id.btnDrugCheckup)
    Button btnDrugCheckup;
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

    //配药核对
    @OnClick(R.id.btnDrugCheckup)
    public void btnDrugCheckup_OnClick()
    {
        Intent intent =new Intent(MainActivity.this,DrugCheckupActivity.class);
        startActivity(intent);
    }
}
