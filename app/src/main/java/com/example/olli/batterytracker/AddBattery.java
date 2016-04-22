package com.example.olli.batterytracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddBattery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.Add_Battery_Title);
        setContentView(R.layout.activity_add_battery);
    }
}
