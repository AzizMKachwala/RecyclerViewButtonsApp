package com.example.LinearVertical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.recyclerviewbuttonsapp.R;

public class MainActivityVertical extends AppCompatActivity {

    RecyclerView listData;
    RecyclerViewAdapterVertical recyclerDataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_vertical);

        listData = findViewById(R.id.listData);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivityVertical.this);
        listData.setLayoutManager(layoutManager);

        recyclerDataAdapter = new RecyclerViewAdapterVertical(this);
        listData.setAdapter(recyclerDataAdapter);
    }
}