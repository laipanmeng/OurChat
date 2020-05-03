package com.lpm_wxl.common.utils;

import com.lpm_wxl.common.base.BaseApplication;

public class ContextUtils {

    public static BaseApplication getAppContext(){
        return BaseApplication.getInstance();
    }
}
