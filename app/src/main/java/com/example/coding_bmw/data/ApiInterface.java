package com.example.coding_bmw.data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/Locations")
    Call<List<Location>> getLocations();

}