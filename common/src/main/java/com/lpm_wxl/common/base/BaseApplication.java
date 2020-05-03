package com.lpm_wxl.common.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lpm_wxl.common.BuildConfig;

public class BaseApplication extends Application {

    private static  BaseApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
        initRouter();
    }
    public static BaseApplication getInstance(){
        return instance;
    }
    private void initRouter(){
        if (BuildConfig.DEBUG) {
            //一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }

}
