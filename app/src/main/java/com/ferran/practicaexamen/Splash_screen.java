package com.ferran.practicaexamen;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        setContentView(R.layout.activity_splash_screen);
        TextView textTitle = (TextView) findViewById(R.id.Title);
        TextView textSubtitle = (TextView) findViewById(R.id.SubTitle);

        Typeface customFont = Typeface.createFromAsset(getAssets(),"fonts/AmaticSC-Regular.ttf");
        textTitle.setTypeface(customFont);
        textSubtitle.setTypeface(customFont);

        getSupportActionBar().hide();



        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        }, 3000);


    }
}
