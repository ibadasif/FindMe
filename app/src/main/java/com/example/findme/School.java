package com.example.findme;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class School extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.getUiSettings().setZoomControlsEnabled(true);

        // Add a marker in Sydney and move the camera
        LatLng TCS = new LatLng(24.908473, 67.106341);
        mMap.addMarker(new MarkerOptions().position(TCS).title("The City School Boys Campus"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TCS));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.9218, 67.1321 )).title("Berlin Doner and Gyro"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.9224, 67.0627)).title("Beaconhouse School System Jahuer KG"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.879896, 67.046188)).title("Aga Khan Higher Secondary School"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.9299, 67.0388 )).title("Islamia College"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.9238, 67.1172)).title("Beaconhouse School System Primary III"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.8589, 67.0801)).title("The Educators K.A.E.C.H.S Campus- Girls"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.8920, 67.0747 )).title("Aga khan University and Hospital"));

    }
}

