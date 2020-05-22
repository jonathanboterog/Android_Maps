package com.ingenico.mapsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickPic1(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(getString(R.string.pLat), -33.444019);
        intent.putExtra(getString(R.string.pLon), -70.653670);
        intent.putExtra(getString(R.string.pMarker), "Plaza de la moneda");
        startActivity(intent);
    }

    public void OnClickPic2(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(getString(R.string.pLat), -33.437858);
        intent.putExtra(getString(R.string.pLon), -70.650569);
        intent.putExtra(getString(R.string.pMarker), "Plaza de Armas");
        startActivity(intent);
    }

    public void OnClickPic3(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(getString(R.string.pLat), -33.434760);
        intent.putExtra(getString(R.string.pLon), -70.644735);
        intent.putExtra(getString(R.string.pMarker), "Parque forestal");
        startActivity(intent);
    }

    public void OnClickPic4(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(getString(R.string.pLat), -33.427943);
        intent.putExtra(getString(R.string.pLon), -70.635213);
        intent.putExtra(getString(R.string.pMarker), "Parque metropolitano");
        startActivity(intent);
    }

}