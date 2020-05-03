package com.lpm_wxl.chat.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lpm_wxl.chat.R;
import com.lpm_wxl.common.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;





@Route(path = "/chat/Chat_Chat_Fragment")
public class Chat_ChatFragment extends BaseFragment {


    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.chat_fragment_chat;
    }

    @Override
    public int initVariableId() {
        return 0;
    }
}
