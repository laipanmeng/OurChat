package com.lpm_wxl.login.viewmodel;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.hyphenate.chat.EMClient;
import com.hyphenate.exceptions.HyphenateException;
import com.lpm_wxl.common.base.BaseViewModel;

public class RegistViewModel extends BaseViewModel{

    public MutableLiveData<String> account = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();
    public MutableLiveData<String> confirmPassword = new MutableLiveData<>();
    public Context context;
    public RegistViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }


    public void registAccount(){
        if (TextUtils.isEmpty(account.getValue())) {
            Toast.makeText(context, "账号不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(password.getValue())) {
            Toast.makeText(context, "密码不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        if (TextUtils.isEmpty(confirmPassword.getValue())) {
            Toast.makeText(context, "请确认密码", Toast.LENGTH_SHORT).show();
            return;
        }
        //注册失败会抛出HyphenateException
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        EMClient.getInstance().createAccount(account.getValue(), password.getValue());//同步方法
                    } catch (HyphenateException e) {
                        e.printStackTrace();
                    }finally {
                        Looper.prepare();
                        Toast.makeText(context, "注册成功", Toast.LENGTH_SHORT).show();
                        Looper.loop();
                    }
                }
            }).start();
    }
}
