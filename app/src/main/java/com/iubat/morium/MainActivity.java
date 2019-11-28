package com.iubat.morium;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button,b1,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Ban vs Wes");
        b1 = (Button) findViewById(R.id.next_button);
        // Capture button clicks
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent1 = new Intent(MainActivity.this,
                        Khelarsomoy.class);
                startActivity(myIntent1);
            }
        });
        button = (Button) findViewById(R.id.next_button1);
        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Khelarmemeber.class);
                startActivity(myIntent);
            }
        });
        b3 = (Button) findViewById(R.id.next_button4);
        // Capture button clicks
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg2) {
                // Start NewActivity.class
                Intent myIntent2 = new Intent(MainActivity.this,
                        Statistics.class);
                startActivity(myIntent2);
            }
        });
        b4 = (Button) findViewById(R.id.next_button5);
        // Capture button clicks
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg2) {
                // Start NewActivity.class
                Intent myIntent3 = new Intent(MainActivity.this,
                        Stedium.class);
                startActivity(myIntent3);
            }
        });
    }
}
