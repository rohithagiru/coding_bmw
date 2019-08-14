package com.example.coding_bmw.data;

import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("ID")
    public Integer id;
    @SerializedName("Name")
    public
    String name;
    @SerializedName("Latitude")
    public Double latitude;
    @SerializedName("Longitude")
   public Double longitude;
    @SerializedName("Address")
   public String address;
    @SerializedName("ArrivalTime")
    public  String arrivalTime;

    public Location(Integer id, String name, Double latitude, Double longitude, String address, String arrivalTime) {
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.arrivalTime = arrivalTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
