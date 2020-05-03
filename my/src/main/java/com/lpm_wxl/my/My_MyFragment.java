package com.lpm_wxl.my;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lpm_wxl.common.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


@Route(path = "/my/My_MyFragment")
public class My_MyFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.my_fragment_chat, null);
        return inflate;
    }
}
