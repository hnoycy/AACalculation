package com.universality.aacalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //打开AACalculation Activity
        Intent intent = new Intent(MainActivity.this , AACalculation.class);
        startActivity(intent);

    }
}
