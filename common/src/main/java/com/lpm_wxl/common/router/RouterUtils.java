package com.lpm_wxl.common.router;

import com.alibaba.android.arouter.launcher.ARouter;

import androidx.fragment.app.Fragment;

public class RouterUtils {

    public static class AppModuleRouter
    {

    }

    public static class LoginModuleRouter
    {

        public static final String LOGINMAINACTIVITY="/login/Login_MainActivity";

    }
    public static class ChatModuleRouter
    { public static final String CHATFRAGMENT="/chat/Chat_Chat_Fragment";
        public static final String CHATMAINACTIVITY="/chat/Chat_MainActivity";

    }
    public static class ContactsModuleRouter
    { public static final String CONTACTSMAINACTIVITY="/contacts/Contacts_MainActivity";
        public static final String CONTACTSFRAGMENT="/contacts/Contacts_ContactsFragment";

    }

    public static class MyModuleRouter
    {
        public static final String MYMAINACTIVITY="/my/My_MainActivity";
        public static final String MYFRAGMENT="/my/My_MyFragment";
    }

    public static Fragment getFragmentByRouter(String router) {
        Fragment fragment = (Fragment) ARouter.getInstance().build(router).navigation();
        return fragment;
    }


}
