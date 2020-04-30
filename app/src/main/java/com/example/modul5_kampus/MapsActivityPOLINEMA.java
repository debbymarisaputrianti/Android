package com.example.modul5_kampus;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityPOLINEMA extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_polinem);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng malangpolinema = new LatLng(-7.946263, 112.615548);
        mMap.addMarker(new MarkerOptions().position(malangpolinema).title("Jl. Candi Panggung No.9, Jatimulyo, Kec. Lowokwaru, Kota Malang, Jawa Timur 65141"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(malangpolinema));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(malangpolinema, 17));
    }
}
