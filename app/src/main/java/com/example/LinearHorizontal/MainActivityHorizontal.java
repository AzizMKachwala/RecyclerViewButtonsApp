package com.example.LinearHorizontal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewbuttonsapp.R;

public class MainActivityHorizontal extends AppCompatActivity {

    RecyclerView listData;

    RecyclerViewAdapterHorizontal recyclerViewAdapterHorizontal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_horizontal);

        listData = findViewById(R.id.listData);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivityHorizontal.this,RecyclerView.HORIZONTAL,false);
        listData.setLayoutManager(layoutManager);

        recyclerViewAdapterHorizontal = new RecyclerViewAdapterHorizontal(this);
        listData.setAdapter(recyclerViewAdapterHorizontal);
    }
}