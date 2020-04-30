package com.example.modul5_kampus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityUnisma extends Activity {

    Button kampus ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unisma);
        kampus = (Button) findViewById(R.id.location_kampus_unisma);
        kampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(),MapsActivityUNISMA.class);
                startActivity(i);
            }
        });
    }
}
