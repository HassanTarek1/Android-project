package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity2 extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        listView=findViewById(R.id.listView2);
        ArrayList<String> arr2=new ArrayList<>();
        arr2.add("El Ekhtyar");
        arr2.add("Al-Nehaya");
        arr2.add("Al-Prince");
        arr2.add("Valentino");
        arr2.add("Al-Fetewa");
        arr2.add("Rijalat Al-Bayt");
        arr2.add("Luebat Al-Nesyan");
        arr2.add("B 100 Wish");
        arr2.add("Etneen Fel Sandoq");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr2);
        listView.setAdapter(arrayAdapter);
    }
}
