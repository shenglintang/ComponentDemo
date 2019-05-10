package com.lin.comp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * 在组件1中通过@Route注解注册该页面
 */
@Route(path = "/comp1/Comp1MainActivity")
public class Comp1MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comp1_activity_main);
        Log.e("lin", "參數= " +getIntent().getStringExtra("test") );
    }
}
