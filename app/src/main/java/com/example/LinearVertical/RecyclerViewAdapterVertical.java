package com.example.LinearVertical;

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

public class RecyclerViewAdapterVertical extends RecyclerView.Adapter<RecyclerViewAdapterVertical.DataViewHolderV> {

    Context context;

    public RecyclerViewAdapterVertical(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public DataViewHolderV onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_data, parent, false);
        return new DataViewHolderV(view);

    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolderV holder, @SuppressLint("RecyclerView") int position) {

        holder.txtPosition.setText("" + position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Clicked " + position, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public class DataViewHolderV extends RecyclerView.ViewHolder {

        TextView txtPosition;

        public DataViewHolderV(@NonNull View itemView) {
            super(itemView);
            txtPosition = itemView.findViewById(R.id.txtPosition);
        }
    }
}
