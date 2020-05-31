package com.lpm_wxl.my;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lpm_wxl.common.base.BaseFragment;
import com.lpm_wxl.my.databinding.MyFragmentChatBinding;
import com.lpm_wxl.my.viewmodel.MyFragmentViewModel;

import androidx.annotation.Nullable;


@Route(path = "/my/My_MyFragment")
public class My_MyFragment extends BaseFragment<MyFragmentChatBinding, MyFragmentViewModel> {

    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.my_fragment_chat;
    }

    @Override
    public int initVariableId() {
        return BR.myviewmodel;
    }
}
