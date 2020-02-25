package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item=OS[position].toString();
                Intent intent=new Intent(ListActivity.this,DeviceDetailedActivity.class);
                intent.putExtra("ListViewclickvalue",item);
                startActivity(intent);
            }
        });
    }
}
