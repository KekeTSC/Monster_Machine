package com.example.wilder.monstermachine;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide action bar
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

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
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 1);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 2);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 3);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 4);
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 5);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 6);
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 7);
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 8);
                startActivity(intent);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,   DetailActivity.class);
                intent.putExtra("monsterId", 9);
                startActivity(intent);
            }
        });

    }

}