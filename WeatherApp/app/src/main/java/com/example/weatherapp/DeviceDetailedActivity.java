package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DeviceDetailedActivity extends AppCompatActivity {
    private String item;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_detailed);
        item=getIntent().getStringExtra("ListViewclickvalue");
        textView=(TextView)findViewById(R.id.textView_item);

    }
}
