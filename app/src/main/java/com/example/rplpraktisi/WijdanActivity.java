package com.example.rplpraktisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WijdanActivity extends AppCompatActivity {
    ImageButton imageButtonwijdan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dean);

        imageButtonwijdan = (ImageButton) findViewById(R.id.buttonwijdan);
        imageButtonwijdan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WijdanActivity.this,MainActivity.class));
            }
        });
    }
}