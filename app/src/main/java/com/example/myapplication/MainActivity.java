package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button drone = findViewById(R.id.drone);
        Button delivery = findViewById(R.id.delivery);

        delivery.setOnClickListener(v -> {

            Intent mlntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.com"));
            startActivity(mlntent);
        });
        drone.setOnClickListener(v -> {

            Intent mlntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kakao.com"));
            startActivity(mlntent);
        });
    }
}