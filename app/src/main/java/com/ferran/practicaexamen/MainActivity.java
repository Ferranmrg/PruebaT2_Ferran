package com.ferran.practicaexamen;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button loginBtn = (Button) findViewById(R.id.loginButton);
        TextView textTitle = (TextView) findViewById(R.id.Title);
        TextView textSubtitle = (TextView) findViewById(R.id.SubTitle);

        Typeface customFont = Typeface.createFromAsset(getAssets(),"fonts/AmaticSC-Regular.ttf");
        textTitle.setTypeface(customFont);
        textSubtitle.setTypeface(customFont);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mainView.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }


}
