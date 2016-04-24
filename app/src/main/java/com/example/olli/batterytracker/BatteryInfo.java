package com.example.olli.batterytracker;

import android.util.Log;

import java.util.UUID;

/**
 * Created by olli on 23.04.2016.
 */
public class BatteryInfo {
    protected UUID id;
    protected int capacity;
    protected boolean charged;

    public BatteryInfo()
    {
        this(0);
    }

    public BatteryInfo(int capacity)
    {
        this.id = UUID.randomUUID();
        this.capacity = capacity;
        Log.i("BattInfo", String.format("Created Batt, UUID: %s, Capacity: %d", this.id.toString(), this.capacity));
    }
}
