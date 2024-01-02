package com.example.Grid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewbuttonsapp.R;

public class MainActivityGrid extends AppCompatActivity {

    RecyclerView listData;
    RecyclerViewAdapterGrid recyclerViewAdapterGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid);

        listData = findViewById(R.id.listData);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(MainActivityGrid.this, 3);
        listData.setLayoutManager(layoutManager);

        recyclerViewAdapterGrid = new RecyclerViewAdapterGrid(this);
        listData.setAdapter(recyclerViewAdapterGrid);
    }
}