package com.example.memory1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Handler hand=new Handler();
        hand.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Description.this,MainActivity.class);
                startActivity(i);
                finish();
            }

        },5000);
    }
}
