package com.example.rplpraktisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DhicoActivity extends AppCompatActivity {
    ImageButton imageButtondhico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dean);

        imageButtondhico = (ImageButton) findViewById(R.id.buttondhico);
        imageButtondhico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DhicoActivity.this,MainActivity.class));
            }
        });
    }
}