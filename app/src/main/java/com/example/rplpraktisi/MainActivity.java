package com.example.rplpraktisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButtondeandra;
    ImageButton imageButtondhico;
    ImageButton imageButtonfitrah;
    ImageButton imageButtonmeilinda;
    ImageButton imageButtonwijdan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        imageButtondeandra = (ImageButton) findViewById(R.id.buttondeandra);
        imageButtondeandra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,DeanActivity.class));
            }
        });

        imageButtondhico = (ImageButton) findViewById(R.id.buttondhico);
        imageButtondhico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,DhicoActivity.class));
            }
        });

        imageButtonfitrah = (ImageButton) findViewById(R.id.buttonfitrah);
        imageButtonfitrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FitrahActivity.class));
            }
        });

        imageButtonmeilinda = (ImageButton) findViewById(R.id.buttonmeilinda);
        imageButtonmeilinda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MeilindaActivity.class));
            }
        });

        imageButtonwijdan = (ImageButton) findViewById(R.id.buttonwijdan);
        imageButtonwijdan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,WijdanActivity.class));
            }
        });

    }
}