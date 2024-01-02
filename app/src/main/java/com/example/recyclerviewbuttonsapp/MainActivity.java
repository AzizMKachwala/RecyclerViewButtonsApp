package com.example.recyclerviewbuttonsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.Grid.MainActivityGrid;
import com.example.LinearHorizontal.MainActivityHorizontal;
import com.example.LinearVertical.MainActivityVertical;

public class MainActivity extends AppCompatActivity {

    Button btnLinearVertical, btnLinearHorizontal, btnGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinearVertical = findViewById(R.id.btnLinearVertical);
        btnLinearHorizontal = findViewById(R.id.btnLinearHorizontal);
        btnGrid = findViewById(R.id.btnGrid);

        btnLinearVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityVertical.class);
                startActivity(intent);
            }
        });

        btnLinearHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityHorizontal.class);
                startActivity(intent);
            }
        });

        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityGrid.class);
                startActivity(intent);
            }
        });

    }
}