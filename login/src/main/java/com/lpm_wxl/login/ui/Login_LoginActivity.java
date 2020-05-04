package com.lpm_wxl.login.ui;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProviders;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lpm_wxl.common.base.BaseActivity;
import com.lpm_wxl.common.base.BaseViewModel;
import com.lpm_wxl.login.BR;
import com.lpm_wxl.login.R;
import com.lpm_wxl.login.viewmodel.Login_LoginViewModel;

@Route(path = "/login/Login_LoginActivity")
public class Login_LoginActivity extends BaseActivity {



    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.login_activity__main;
    }

    @Override
    public int initVariableId() {
        return BR.loginViewModel;
    }

    @Override
    public BaseViewModel initViewModel() {
        return ViewModelProviders.of(this).get(Login_LoginViewModel.class);
    }


}
