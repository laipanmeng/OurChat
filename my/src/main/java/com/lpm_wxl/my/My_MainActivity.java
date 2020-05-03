package com.lpm_wxl.my;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lpm_wxl.common.base.BaseActivity;
import com.lpm_wxl.common.base.BaseViewModel;

public class My_MainActivity extends BaseActivity {


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.my_activity__main;
    }

    @Override
    public int initVariableId() {
        return 0;
    }
}
