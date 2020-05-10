package com.lpm_wxl.my.viewmodel;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.lpm_wxl.common.base.BaseViewModel;

public class MyFragmentViewModel extends BaseViewModel {

    private Context context;

    public MyFragmentViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }


    //二维码 点击事件
    public void qrCodeOnClickListener(){
        Toast.makeText(context, "点击二维码", Toast.LENGTH_SHORT);
    }

    //设置 点击事件
    public void settingOnClickListener(){
        Toast.makeText(context, "点击设置", Toast.LENGTH_SHORT);
    }

    //帮助和客服 点击事件
    public void helpOnClickListener(){
        Toast.makeText(context, "点击帮助与客服", Toast.LENGTH_SHORT);
    }

    //关于 点击事件
    public void aboutOnClickListener(){
        Toast.makeText(context, "点击关于", Toast.LENGTH_SHORT);
    }
}
