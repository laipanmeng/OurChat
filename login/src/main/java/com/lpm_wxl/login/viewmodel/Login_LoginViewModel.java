package com.lpm_wxl.login.viewmodel;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;
import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;
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
        EMClient.getInstance().login(username, password, new EMCallBack() {
            @Override
            public void onSuccess() {
                Log.i("103020", "onSuccess: 登录成功");
                ARouter.getInstance().build("/app/App_MainActivity").navigation();
            }

            @Override
            public void onError(int code, String error) {
                Log.i("103020", "onError: 登录失败 = " + code + " ------ error = " + error);
            }

            @Override
            public void onProgress(int progress, String status) {
                Log.i("103020", "onProgress: 正在登录 = " + status);
            }
        });

    }

    public void regist(){
        ARouter.getInstance().build("/login/RegistActivity").navigation();
    }
}
