package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity3 extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list3);
        listView=findViewById(R.id.listView3);
        ArrayList<String> arr2=new ArrayList<>();
        arr2.add("Ramez Magnoun Rasmy");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr2);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(ListActivity3.this, DetailedActivity.class);
                if (position==0) {
                    intent.putExtra("title", "Ramez Magnoun Rasmy");
                    intent.putExtra("channel", "MBC MASR");
                    intent.putExtra("display", "06:30 PM");
                    intent.putExtra("reDisplay", "02:00 AM, 09:00 AM");
                    intent.putExtra("stars", " Ramez Galal  Arwa");
                    intent.putExtra("description", "No Description");
                    intent.putExtra("promo", "https://youtu.be/gWd-Qj0lnUw");

                }
                startActivity(intent);
            }
        });
    }
}
