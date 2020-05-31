package com.lpm_wxl.login.ui;

import android.os.Bundle;


import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lpm_wxl.common.base.BaseActivity;
import com.lpm_wxl.common.base.BaseViewModel;
import com.lpm_wxl.login.BR;
import com.lpm_wxl.login.R;
import com.lpm_wxl.login.viewmodel.RegistViewModel;

@Route(path = "/login/RegistActivity")
public class RegistActivity extends BaseActivity {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.regist;
    }

    @Override
    public int initVariableId() {
        return BR.registViewModel;
    }

    @Override
    public BaseViewModel initViewModel() {
        return ViewModelProviders.of(this).get(RegistViewModel.class);
    }
}
