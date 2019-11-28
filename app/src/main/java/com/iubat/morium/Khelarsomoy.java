package com.iubat.morium;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Khelarsomoy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khelarsomoy);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Time");

    }
}
