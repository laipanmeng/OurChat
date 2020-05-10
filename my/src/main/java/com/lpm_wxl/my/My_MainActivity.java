package com.lpm_wxl.my;


import android.os.Bundle;
import android.util.Log;

import com.lpm_wxl.common.base.BaseActivity;

public class My_MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public int initContentView(Bundle savedInstanceState) {

        return R.layout.my_activity__main;
    }

    @Override
    public int initVariableId() {
        return 0;
    }
}
