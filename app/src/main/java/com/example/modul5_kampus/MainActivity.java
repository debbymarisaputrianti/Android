package com.example.modul5_kampus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends Activity {

    ImageButton umm,ub,um,unisma,uin,polinema ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        umm = (ImageButton) findViewById(R.id.button_umm);
        umm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(),ActivityUmm.class);
                startActivity(i);
            }
        });
        ub = (ImageButton) findViewById(R.id.button_ub);
        ub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(),ActivityUb.class);
                startActivity(i);
            }
        });
        um = (ImageButton) findViewById(R.id.button_um);
        um.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(),ActivityUm.class);
                startActivity(i);
            }
        });
        unisma = (ImageButton) findViewById(R.id.button_unisma);
        unisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(),ActivityUnisma.class);
                startActivity(i);
            }
        });
        uin = (ImageButton) findViewById(R.id.button_uin);
        uin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(),ActivityUin.class);
                startActivity(i);
            }
        });
        polinema = (ImageButton) findViewById(R.id.button_polinema);
        polinema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(),ActivityPolinema.class);
                startActivity(i);
            }
        });

    }
}
