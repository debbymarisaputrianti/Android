package com.example.modul5_kampus;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng malang = new LatLng(-7.921187, 112.597398);
        mMap.addMarker(new MarkerOptions().position(malang).title("Jl.Raya Tlogomas No. 246, Tlogomas, Lowokwaru, Babatan, Tegalgondo, Karangploso, Kota Malang, Jawa Timur 65144"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(malang));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(malang, 17));
    }
}
