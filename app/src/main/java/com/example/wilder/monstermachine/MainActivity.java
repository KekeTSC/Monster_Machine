package com.example.wilder.monstermachine;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide action bar
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Curse Casual.ttf");

        TextView sealion = (TextView) findViewById(R.id.Sealion);
            sealion.setTypeface(tf);
        TextView chocobunny = (TextView) findViewById(R.id.ChocoBunny);
            chocobunny.setTypeface(tf);
        TextView pandaclaus = (TextView) findViewById(R.id.PandaClaus);
            pandaclaus.setTypeface(tf);
        TextView metaselash = (TextView) findViewById(R.id.Metaselash);
            metaselash.setTypeface(tf);
        TextView mechamancer = (TextView) findViewById(R.id.Mechamancer);
            mechamancer.setTypeface(tf);
        TextView komocat = (TextView) findViewById(R.id.Komocat);
            komocat.setTypeface(tf);
        TextView fenix = (TextView) findViewById(R.id.Fenix);
            fenix.setTypeface(tf);
        TextView thundereagle = (TextView) findViewById(R.id.ThunderEagle);
            thundereagle.setTypeface(tf);
        TextView pegasus = (TextView) findViewById(R.id.Pegasus);
            pegasus.setTypeface(tf);
        TextView obsidia = (TextView) findViewById(R.id.Obsidia);
            obsidia.setTypeface(tf);
        //
        ImageButton btn0 = (ImageButton) findViewById(R.id.imageSealion);
        ImageButton btn1 = (ImageButton) findViewById(R.id.imageChocoBunny);
        ImageButton btn2 = (ImageButton) findViewById(R.id.imagePandaClaus);
        ImageButton btn3 = (ImageButton) findViewById(R.id.imageMetaselash);
        ImageButton btn4 = (ImageButton) findViewById(R.id.imageMechamancer);
        ImageButton btn5 = (ImageButton) findViewById(R.id.imageKomocat);
        ImageButton btn6 = (ImageButton) findViewById(R.id.imageFenix);
        ImageButton btn7 = (ImageButton) findViewById(R.id.imageThunderEagle);
        ImageButton btn8 = (ImageButton) findViewById(R.id.imagePegasus);
        ImageButton btn9 = (ImageButton) findViewById(R.id.imageObsidia);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 0);
                startActivity(intent);
                overridePendingTransition(R.anim.top_in, R.anim.bottom_out);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 1);
                startActivity(intent);
                overridePendingTransition(R.anim.top_in, R.anim.bottom_out);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 2);
                startActivity(intent);
                overridePendingTransition(R.anim.top_in, R.anim.bottom_out);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 3);
                startActivity(intent);
                overridePendingTransition(R.anim.top_in, R.anim.bottom_out);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 4);
                startActivity(intent);
                overridePendingTransition(R.anim.top_in, R.anim.bottom_out);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 5);
                startActivity(intent);
                overridePendingTransition(R.anim.top_in, R.anim.bottom_out);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 6);
                startActivity(intent);
                overridePendingTransition(R.anim.top_in, R.anim.bottom_out);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 7);
                startActivity(intent);
                overridePendingTransition(R.anim.top_in, R.anim.bottom_out);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 8);
                startActivity(intent);
                overridePendingTransition(R.anim.top_in, R.anim.bottom_out);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 9);
                startActivity(intent);
                overridePendingTransition(R.anim.top_in, R.anim.bottom_out);
            }
        });

    }

}