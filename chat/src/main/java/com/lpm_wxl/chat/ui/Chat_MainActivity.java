package com.lpm_wxl.chat.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lpm_wxl.chat.R;
import com.lpm_wxl.common.base.BaseActivity;

public class Chat_MainActivity extends BaseActivity {



    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.chat_activity__main;
    }

    @Override
    public int initVariableId() {
        return 0;
    }
}
