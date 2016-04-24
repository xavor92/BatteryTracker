package com.example.olli.batterytracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;
import android.view.Menu;

public class AddBattery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.add_battery_title);
        setContentView(R.layout.activity_add_battery);
        BatteryInfo newBatt = new BatteryInfo();
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar_add_battery);
        setSupportActionBar(myToolbar);
        ActionBar ab = getSupportActionBar();
        if(ab != null)
        {
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_battery, menu);
        return true;
    }
}
