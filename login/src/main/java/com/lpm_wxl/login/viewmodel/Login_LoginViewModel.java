package com.lpm_wxl.login.viewmodel;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lpm_wxl.common.base.BaseViewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

public class Login_LoginViewModel extends BaseViewModel {

    public MutableLiveData<String> userName = new MutableLiveData<>();
    public MutableLiveData<String> passWord = new MutableLiveData<>();
    private Context context;
    public Login_LoginViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public void login() {
        String username = userName.getValue();
        String password = passWord.getValue();
//        ARouter.getInstance().build("/app/App_MainActivity").navigation();
        Log.e("Linsane", "login: username=" + username + ",password=" + password);
    }
}
