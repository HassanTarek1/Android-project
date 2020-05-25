package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {
    TextView channel;
    TextView title;
    TextView displayTime;
    TextView reDisplay;
    TextView stars;
    TextView description;
    TextView promo;
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_detailed);this.title=findViewById(R.id.head);
        this.channel=findViewById(R.id.textViewChannel);
        this.displayTime=findViewById(R.id.textViewDisplay);
        this.reDisplay=findViewById(R.id.textViewReDisplay);
        this.stars=findViewById(R.id.textViewMainStars);
        this.description=findViewById(R.id.textViewDescription);
        this.promo=findViewById(R.id.textViewPromo);
        this.pic=findViewById(R.id.imageViewMosalsal);
        Bundle bundle=getIntent().getExtras();
        title.setText(bundle.getString("title"));
        channel.setText(bundle.getString("channel"));
        displayTime.setText(bundle.getString("display"));
        reDisplay.setText(bundle.getString("reDisplay"));
        stars.setText(bundle.getString("stars"));
        description.setText(bundle.getString("description"));
        promo.setText(bundle.getString("promo"));
        String mosalsal=bundle.getString("title");
        switch (mosalsal){
            case "El Ekhtyar":pic.setImageResource(R.drawable.alekhtyar2);break;
            case "Al-Nehaya":pic.setImageResource(R.drawable.al_nehaya);break;
            case "Al-Prince":pic.setImageResource(R.drawable.el_prince);break;
            case "Valentino":pic.setImageResource(R.drawable.valantino);break;
            case "Al-Fetewa":pic.setImageResource(R.drawable.el_fetwa);break;
            case "Rijalat Al-Bayt":pic.setImageResource(R.drawable.regalet_elbeet);break;
            case "Luebat Al-Nesyan":pic.setImageResource(R.drawable.le3bt_elnsyan);break;
            case " B 100 Wish":pic.setImageResource(R.drawable.b100wsh);break;
            case "Etneen Fel Sandoq":pic.setImageResource(R.drawable.etnen);break;
            case "Ramez Magnoun Rasmy":pic.setImageResource(R.drawable.ramez);break;
        }


    }
}
