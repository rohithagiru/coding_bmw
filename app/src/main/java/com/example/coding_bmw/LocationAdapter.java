package com.example.coding_bmw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coding_bmw.data.Location;

import java.util.List;

public class LocationAdapter extends RecyclerView.Adapter {
    List<Location> locationList;
    Context context;

    public LocationAdapter(MainActivity mainActivity, List<Location> response) {
        locationList = response;
        context = mainActivity;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_row, parent, false);

        return new LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        LocationViewHolder locationViewHolder = (LocationViewHolder) holder;
        locationViewHolder.tvName.setText(locationList.get(position).getName());
        locationViewHolder.tvAddress.setText(locationList.get(position).getAddress());
        locationViewHolder.tvTime.setText(locationList.get(position).getArrivalTime());
       // locationViewHolder.tvDistance.setText(locationList.get(position).getDistance);


    }

    @Override
    public int getItemCount() {
        return locationList.size();
    }
}
