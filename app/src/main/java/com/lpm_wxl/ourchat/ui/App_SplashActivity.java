package com.lpm_wxl.ourchat.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lpm_wxl.common.BR;
import com.lpm_wxl.common.base.BaseActivity;
import com.lpm_wxl.common.router.RouterUtils;
import com.lpm_wxl.common.utils.SpUtlis;
import com.lpm_wxl.login.constant.Login_Constant;
import com.lpm_wxl.ourchat.R;
import com.lpm_wxl.ourchat.databinding.AppActivitySplashBinding;
import com.lpm_wxl.ourchat.model.App_SplashViewModel;


@Route(path = "/app/App_SplashActivity")
public class App_SplashActivity extends BaseActivity <AppActivitySplashBinding, App_SplashViewModel>{


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.app_activity_splash;
    }

    @Override
    public int initVariableId() {
        return 0;
    }

    @Override
    public void initData() {

        if(SpUtlis.getBoolean(Login_Constant.ISLOGIN))
        {
            ARouter.getInstance().build(RouterUtils.AppModuleRouter.APP_MAINACTIVITY).navigation();
        }else
            {
                ARouter.getInstance().build(RouterUtils.LoginModuleRouter.LOGINMAINACTIVITY).navigation();
            }



    }

    @Override
    public void initViewObservable() {

    }
}
