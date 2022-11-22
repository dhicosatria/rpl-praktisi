package com.example.rplpraktisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MeilindaActivity extends AppCompatActivity {
    ImageButton imageButtonmeilinda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dean);

        imageButtonmeilinda = (ImageButton) findViewById(R.id.buttonmeilinda);
        imageButtonmeilinda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MeilindaActivity.this,MainActivity.class));
            }
        });
    }
}