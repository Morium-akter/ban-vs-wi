package com.iubat.morium;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Khelarmemeber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khelarmemeber);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Member");
    }
}
