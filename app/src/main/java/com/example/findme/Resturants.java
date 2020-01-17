package com.example.findme;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Resturants extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturants);
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
        LatLng BL = new LatLng(24.917122, 67.131316);
        mMap.addMarker(new MarkerOptions().position(BL).title("Burger Lab Jahur"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(BL));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.904084, 67.077181)).title("Burger Lab Gulshan"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.793548, 67.048691 )).title("Berlin Doner and Gyro"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.875033, 67.095316)).title("Rosati Bistro"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.931900, 67.100692)).title("Burger o clock"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.906900, 67.111602 )).title("Broadway RMR"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.932106, 67.088150)).title("Broadway Luckyoe Mall"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.914431, 67.123183)).title("Ginsoy (Jahur)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(24.933156, 67.102347 )).title("Ginsoy (Gulshan)"));

    }
}

