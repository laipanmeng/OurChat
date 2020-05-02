package com.lpm_wxl.commond.utils;

import com.lpm_wxl.commond.base.BaseApplication;

public class ContextUtils {

    public static BaseApplication getAppContext(){
        return BaseApplication.getInstance();
    }
}
