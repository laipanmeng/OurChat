package com.lpm_wxl.login;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.lpm_wxl.common.base.BaseActivity;

public class Login_MainActivity extends BaseActivity {



    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.login_activity__main;
    }

    @Override
    public int initVariableId() {
        return 0;
    }
}
