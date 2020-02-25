package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    String[] OS={"Android","iPhone","Windows","Blackberry","Linux"};
    Integer[] imgId=
            {R.drawable.android,R.drawable.apple,R.drawable.windows,R.drawable.blackberry,R.drawable.linux};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView=(ListView)findViewById(R.id.listView);
        CustomeListView customeListView=new CustomeListView(this,OS,imgId);
        listView.setAdapter(customeListView);
    }
}
