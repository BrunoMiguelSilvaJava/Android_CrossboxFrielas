package pt.statemachine.crossboxfrielas;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class BoxLocationActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box_location);
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
        // Add a marker in Crossbox and move the camera
        LatLng crossbox = new LatLng(38.8195441,-9.1484398);

        //Activate Traffic Layer
        mMap.setTrafficEnabled(true);
        //Add pin to Crossbox location
        Marker crossboxMarker = mMap.addMarker(new MarkerOptions().position(crossbox).title("Crossbox Frielas"));
        crossboxMarker.showInfoWindow();
        //Defines camera position
        CameraPosition position = new CameraPosition.Builder().target(crossbox).zoom(16).build();
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(position));

        mMap.getUiSettings().setZoomControlsEnabled(true);
        //mMap.getUiSettings().setCompassEnabled(true);
        //mMap.getUiSettings().setMyLocationButtonEnabled(true);
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(crossbox, 16));
        //mMap.setMapType(googleMap.MAP_TYPE_SATELLITE);
    }
}
