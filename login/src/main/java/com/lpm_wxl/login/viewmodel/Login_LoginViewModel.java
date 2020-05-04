package com.lpm_wxl.login.viewmodel;

import android.app.Application;
import android.util.Log;

import com.lpm_wxl.common.base.BaseViewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

public class Login_LoginViewModel extends BaseViewModel {

  public MutableLiveData<String> userName = new MutableLiveData<>();
    public  MutableLiveData <String> passWord = new MutableLiveData<>();

    public Login_LoginViewModel(@NonNull Application application) {
        super(application);

    }

  public  void  login()
    {

       String username= userName.getValue();
       String password = passWord.getValue();
        Log.e("", "login: username="+username+",password="+password );
    }
}
