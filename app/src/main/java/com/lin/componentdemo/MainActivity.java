package com.lin.componentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在组件1中发起跳转命令
                ARouter.getInstance()
                        .build("/comp1/Comp1MainActivity")
                        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        .withString("test","测试")
                        .navigation();
            }
        });
    }
}
