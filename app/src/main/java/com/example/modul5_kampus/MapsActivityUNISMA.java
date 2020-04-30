package com.example.modul5_kampus;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityUNISMA extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_unism);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng malangunisma = new LatLng(-7.936452, 112.606735);
        mMap.addMarker(new MarkerOptions().position(malangunisma).title("Jl. Mayjen Haryono Gg. 10 Kelurahan No.193, Dinoyo, Kec. Lowokwaru, Kota Malang, Jawa Timur 65144"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(malangunisma));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(malangunisma, 17));
    }
}
