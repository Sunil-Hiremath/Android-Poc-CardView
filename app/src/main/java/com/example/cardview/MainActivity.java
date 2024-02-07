package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CardView cardview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardview=findViewById(R.id.cardView);
        // we can also set he attributes of the cardview through java also
/*
        cardview.setRadius(5.0f);// takes float values
        cardview.setCardElevation(11.0f);
        cardview.setUseCompatPadding(true);*/
        //adding in the git


    }
}