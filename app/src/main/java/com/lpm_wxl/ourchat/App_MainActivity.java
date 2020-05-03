package com.lpm_wxl.ourchat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lpm_wxl.common.router.RouterUtils;

import java.util.ArrayList;
import java.util.List;

public class App_MainActivity extends AppCompatActivity {

    FrameLayout FramePage;
    BottomNavigationView navigation;
    Fragment contactsFragment, myFragment, chatFragment;

    private List<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_main);
        Log.i("103020", "onCreate: ");

        FramePage = findViewById(R.id.FramePage);
        navigation = findViewById(R.id.navigation);
        chatFragment = RouterUtils.getFragmentByRouter(RouterUtils.ChatModuleRouter.CHATFRAGMENT);
        contactsFragment = RouterUtils.getFragmentByRouter(RouterUtils.ContactsModuleRouter.CONTACTSFRAGMENT);
        myFragment = RouterUtils.getFragmentByRouter(RouterUtils.MyModuleRouter.MYFRAGMENT);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                navigationItemSelected(item.getItemId());
                return true;
            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.FramePage, contactsFragment).commit();


     }


    private void navigationItemSelected(int itemId) {
        Fragment fragment = null;
        Log.d("123", "onNavigationItemSelected is click: ");
        switch (itemId) {
            case R.id.navigation_home:
                fragment = chatFragment;
                break;
            case R.id.navigation_dashboard:
                fragment = contactsFragment;


                break;
            case R.id.navigation_notifications:
                fragment = myFragment;

                break;
        }

        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.FramePage, fragment).commit();        }

    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
