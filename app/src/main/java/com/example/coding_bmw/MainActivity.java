package com.example.coding_bmw;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coding_bmw.data.ApiClient;
import com.example.coding_bmw.data.ApiInterface;
import com.example.coding_bmw.data.Location;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    LocationAdapter locationAdapter;
    private static final String TAG = MainActivity.class.getSimpleName();
    private String urlJsonObj ="http://localsearch.azurewebsites.net/";
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);

    }

    public void getJson(View view) {
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        Call<List<Location>> call = apiService.getLocations();
        call.enqueue(new Callback<List<Location>>() {
            @Override
            public void onResponse(Call<List<Location>> call, Response<List<Location>> response) {
                Log.i(TAG,"response="+response.body().get(0).name);
                Log.i(TAG,"url ="+call.request().url().toString());
                locationAdapter = new LocationAdapter(MainActivity.this, response.body());
                recyclerView.setAdapter(locationAdapter);
            }

            @Override
            public void onFailure(Call<List<Location>> call, Throwable t) {
                Log.i(TAG,"url ="+call.request().url().toString());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         super.onOptionsItemSelected(item);
         switch (item.getItemId()){
             case R.id.sort_name:
                 locationAdapter.locationList.sort(new NameComparator());
                 locationAdapter.notifyDataSetChanged();
                 break;
         }

        return true;
    }
}
