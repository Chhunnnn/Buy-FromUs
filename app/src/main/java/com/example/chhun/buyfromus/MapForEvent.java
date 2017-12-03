package com.example.chhun.buyfromus;

import android.content.Context;
import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapForEvent extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_for_event);
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

        // Add a marker in Sydney and move the camera
        LatLng device_loc = new LatLng(11.563659, 104.91126);
        LatLng cl_concert = new LatLng(11.550315, 104.942286);
        mMap.addMarker(new MarkerOptions().position(cl_concert).title("Smart Mega Concert CL"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cl_concert));
        mMap.addMarker(new MarkerOptions().position(device_loc).title("Chhun"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(device_loc));
//        mMap.setMaxZoomPreference(14.0f);
//        CameraUpdateFactory.zoomTo(5);
        mMap.animateCamera( CameraUpdateFactory.zoomTo( 13.0f ) );
    }
}

//    private GeoApiContext getGeoContext() {
//
////        com.google.maps.model.LatLng destination = new com.google.maps.model.LatLng(11.550315, 104.942286);
////        com.google.maps.model.LatLng origin = new com.google.maps.model.LatLng(11.550315, 104.942286);
//        try {
//            DateTime now = new DateTime();
//            com.google.maps.model.LatLng destination = new com.google.maps.model.LatLng(11.550315, 104.942286);
//            com.google.maps.model.LatLng origin = new com.google.maps.model.LatLng(11.550315, 104.942286);
//            DirectionsResult result = DirectionsApi
//                    .newRequest(getGeoContext())
//                    .mode(TravelMode.DRIVING).origin(origin)
//                    .destination(destination).departureTime(now)
//                    .await();
//        } catch (ApiException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        GeoApiContext geoApiContext = new GeoApiContext();
//        return geoApiContext.setQueryRateLimit(3)
//                .setApiKey(getString(R.string.google_api_key))
//                .setConnectTimeout(1, TimeUnit.SECONDS)
//                .setReadTimeout(1, TimeUnit.SECONDS)
//                .setWriteTimeout(1, TimeUnit.SECONDS);
//        }
//
//    private void addMarkersToMap(DirectionsResult results, GoogleMap mMap) {
//            mMap.addMarker(new MarkerOptions().position(new LatLng(results.routes[0]
//                    .legs[0].startLocation.lat,results.routes[0]
//                    .legs[0].startLocation.lng))
//                    .title(results.routes[0].legs[0].startAddress));
//            mMap.addMarker(new MarkerOptions().position(new LatLng(results.routes[0].legs[0].endLocation.lat,results.routes[0].legs[0].endLocation.lng)).title(results.routes[0].legs[0].startAddress).snippet(getEndLocationTitle(results)));
//        }
//
//        private String getEndLocationTitle(DirectionsResult results){
//            return  "Time :"+ results.routes[0]
//                    .legs[0].duration.humanReadable + " Distance :" + results.routes[0].legs[0].distance.humanReadable;    }
//
//        private void addPolyline(DirectionsResult results, GoogleMap mMap) {
//            List<LatLng> decodedPath = PolyUtil.decode(results.routes[0].overviewPolyline.getEncodedPath());
//            mMap.addPolyline(new PolylineOptions().addAll(decodedPath));
//        }

//    public GoogleMap.OnMyLocationButtonClickListener myLocation = new GoogleMap.OnMyLocationButtonClickListener() {
//        @Override
//        public boolean onMyLocationButtonClick() {
//            locationMan = (Location) mContext
//                    .getSystemService(LOCATION_SERVICE);
//            double lat, lon;
//            lat = getLat
//            LatLng loc = new LatLng(Location.getLatitude(), Location.getLongitude());
//             = mMap.addMarker(new MarkerOptions().position(loc));
//            if(mMap != null){
//                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(loc, 16.0f));
//            }
//        }
//    }
