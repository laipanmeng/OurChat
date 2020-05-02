package com.lpm_wxl.ourchat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("103020", "onCreate: ");
        Toast.makeText(this, "4564654", Toast.LENGTH_SHORT).show();
    }
}
