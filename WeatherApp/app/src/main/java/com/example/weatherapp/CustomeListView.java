package com.example.weatherapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomeListView extends ArrayAdapter<String> {

    private String[] OS;
    private Integer[] imgId;
    private Activity context;



    public CustomeListView(Activity context, String[] OS, Integer[] imgId) {
        super(context, R.layout.listview_layout,OS);
        this.context=context;
        this.OS=OS;
        this.imgId=imgId;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r=convertView;
        ViewHolder viewHolder=null;
        if (r==null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listview_layout,null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }else {
            viewHolder=(ViewHolder)r.getTag();
        }
        viewHolder.imageView.setImageResource(imgId[position]);
        viewHolder.textView.setText(OS[position]);


        return r;
    }
    class ViewHolder{
        TextView textView;
        ImageView imageView;

        ViewHolder(View v){
            textView=(TextView)v.findViewById(R.id.textView_list);
            imageView=(ImageView)v.findViewById(R.id.imageView_list);
        }
    }
}
