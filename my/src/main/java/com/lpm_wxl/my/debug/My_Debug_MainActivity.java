package com.lpm_wxl.my.debug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lpm_wxl.my.My_MyFragment;
import com.lpm_wxl.my.R;

public class My_Debug_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_debug_activity_main);
        My_MyFragment fragment = new My_MyFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.my_debug_fl, fragment).commit();
    }
}
