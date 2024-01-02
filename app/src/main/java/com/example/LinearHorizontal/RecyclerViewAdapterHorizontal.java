package com.example.LinearHorizontal;

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

public class RecyclerViewAdapterHorizontal extends RecyclerView.Adapter<RecyclerViewAdapterHorizontal.DataViewHolderH> {

    Context context;

    public RecyclerViewAdapterHorizontal(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public DataViewHolderH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_data,parent,false);
        return new DataViewHolderH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolderH holder, @SuppressLint("RecyclerView") int position) {
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
        return 10;
    }

    public class DataViewHolderH extends RecyclerView.ViewHolder {

        TextView txtPosition;

        public DataViewHolderH(@NonNull View itemView) {
            super(itemView);
            txtPosition = itemView.findViewById(R.id.txtPosition);
        }
    }
}
