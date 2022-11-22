package com.example.rplpraktisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FitrahActivity extends AppCompatActivity {
    ImageButton imageButtonfitrah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dean);

        imageButtonfitrah = (ImageButton) findViewById(R.id.buttonfitrah);
        imageButtonfitrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FitrahActivity.this,MainActivity.class));
            }
        });
    }
}