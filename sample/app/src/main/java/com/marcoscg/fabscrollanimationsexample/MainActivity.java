package com.marcoscg.fabscrollanimationsexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startDefault(View v) {
        Intent intent = new Intent(getApplicationContext(), DefaultFAB.class);
        startActivity(intent);
    }

    public void startFade(View v) {
        Intent intent = new Intent(getApplicationContext(), FadeFAB.class);
        startActivity(intent);
    }

    public void startFloat(View v) {
        Intent intent = new Intent(getApplicationContext(), FloatFAB.class);
        startActivity(intent);
    }
}