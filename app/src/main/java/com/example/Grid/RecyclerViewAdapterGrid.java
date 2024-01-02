package com.example.Grid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewbuttonsapp.R;

public class RecyclerViewAdapterGrid extends RecyclerView.Adapter<RecyclerViewAdapterGrid.DataViewHolderG> {

    Context context;

    public RecyclerViewAdapterGrid(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public DataViewHolderG onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_data,parent,false);
        return new DataViewHolderG(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolderG holder, @SuppressLint("RecyclerView") int position) {

        holder.txtPosition.setText(""+position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicked "+position, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public class DataViewHolderG extends RecyclerView.ViewHolder{

        TextView txtPosition;

        public DataViewHolderG(@NonNull View itemView) {
            super(itemView);
            txtPosition = itemView.findViewById(R.id.txtPosition);
        }
    }
}
