package com.example.coding_bmw;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LocationViewHolder extends RecyclerView.ViewHolder {

    TextView tvName;
    TextView tvAddress;
    TextView tvDistance;
    TextView tvTime;


    public LocationViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.textViewName);
        tvAddress = itemView.findViewById(R.id.textViewAddress);
        tvDistance = itemView.findViewById(R.id.textViewDistance);
        tvTime = itemView.findViewById(R.id.textViewTime);


    }
}
