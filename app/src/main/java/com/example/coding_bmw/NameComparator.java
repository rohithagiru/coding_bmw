package com.example.coding_bmw;

import com.example.coding_bmw.data.Location;

import java.util.Comparator;

public class NameComparator implements Comparator<Location> {

    @Override
    public int compare(Location location, Location t1) {
        return location.name.compareTo(t1.name);
    }

    @Override
    public Comparator<Location> reversed() {
        return null;
    }
}
